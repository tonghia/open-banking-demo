package local.open_banking.demo.io.service;

import local.open_banking.demo.io.entity.Transaction;
import local.open_banking.demo.io.repository.MerchantDetailsRepository;
import local.open_banking.demo.io.repository.TransactionApiClient;
import local.open_banking.demo.io.repository.TransactionRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@Service
public class TransactionService {
    public TransactionService(final TransactionApiClient transactionApiClient,
            final MerchantDetailsRepository merchantDetailsRepository,
            final TransactionRepository transactionRepository) {
        this.transactionApiClient = transactionApiClient;
        this.merchantDetailsRepository = merchantDetailsRepository;
        this.transactionRepository = transactionRepository;
    }

    @CircuitBreaker(name = "transactionService", fallbackMethod = "findAllByAccountNumber")
    public List<Transaction> findAllByAccountNumber(final Integer accountNumber) throws Exception {
        var transactions = transactionApiClient.findAllByAccountNumber(accountNumber);
        transactions.forEach(transaction -> {
            merchantDetailsRepository.findMerchantLogo(transaction.getMerchantName())
                    .ifPresent(logo -> transaction.setMerchantLogo(logo));
        });

        return transactions;
    }

    private List<Transaction> findAllByAccountNumber(final Integer accountNumber, final Throwable throwable) {
        log.info("falling back to database to get transactions");
        return transactionRepository.findAllByAccountNumber(accountNumber);
    }

    private final TransactionApiClient transactionApiClient;
    private final MerchantDetailsRepository merchantDetailsRepository;
    private final TransactionRepository transactionRepository;
}
