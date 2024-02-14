package com.nctech.axisbank.services;

import com.nctech.axisbank.dto.Transaction;

public interface TransactionService {
    void save(Long toAccount, Long fromAccount, Double amount);
    Transaction[] getAll();
    Transaction getTransation(Integer id);
    void depositMoney(Long accountNo, Double amountToBeDeposited);
    void withdrawMoney(Long accountNo, Double amountToBeWithdrawn);
    void transferMoeny(Long toAccountNo, Long fromAccountNo, Double amountToBeTransferred);
}
