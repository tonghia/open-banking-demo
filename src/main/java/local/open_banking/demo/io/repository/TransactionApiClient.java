package local.open_banking.demo.io.repository;

import local.open_banking.demo.io.entity.Transaction;

import java.util.List;

public interface TransactionApiClient {
    List<Transaction> findAllByAccountNumber(final Integer accountNumber) throws Exception;
}
