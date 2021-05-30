package local.open_banking.demo.service;

import local.open_banking.demo.io.entity.Transaction;
import local.open_banking.demo.io.repository.TransactionRepository;
import local.open_banking.demo.io.service.TransactionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class TransactionServiceTest {

    @Mock
    private TransactionRepository transactionRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testTransactionCount() {
        when(transactionRepository.findAllByAccountNumber(anyInt())).thenReturn(transactions());

        var transactionService = new TransactionService(transactionRepository);
        assertEquals(1, transactionService.findAllByAccountNumber(1234567).size());
    }

    private List<Transaction> transactions() {
        return List.of(Transaction.builder().type("credit").date(new Date()).accountNumber(1234567).currency("USD")
                .amount(100.00).merchantName("acme").merchantLogo("images/acme-logo.png").build());
    }
}
