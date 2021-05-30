package local.open_banking.demo.io.service;

import local.open_banking.demo.io.entity.Transaction;
import local.open_banking.demo.io.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    public TransactionService(final TransactionRepository repository) {
        this.repository = repository;
    }

    public List<Transaction> findAllByAccountNumber(final Integer accountNumber) {
        return repository.findAllByAccountNumber(accountNumber);
    }

    private final TransactionRepository repository;
}
