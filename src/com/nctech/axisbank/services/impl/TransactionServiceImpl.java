package com.nctech.axisbank.services.impl;

import com.nctech.axisbank.dto.Account;
import com.nctech.axisbank.dto.Transaction;
import com.nctech.axisbank.repository.TransactionRepository;
import com.nctech.axisbank.repository.impl.TransactionRepositoryImpl;
import com.nctech.axisbank.services.AccountService;
import com.nctech.axisbank.services.TransactionService;

public class TransactionServiceImpl implements TransactionService {

    TransactionRepository transactionRepository = new TransactionRepositoryImpl();
    AccountService accountService = new AccountServiceImpl();

    @Override
    public void save(Long toAccount, Long fromAccount, Double amount) {
        Integer id = transactionRepository.getAll().length +1;
        Transaction transaction = new Transaction(id, fromAccount, toAccount, amount);
        transactionRepository.save(transaction);
    }

    @Override
    public Transaction[] getAll() {
       return transactionRepository.getAll();
    }

    @Override
    public Transaction getTransation(Integer id) {
        for (Transaction transaction: getAll()) {
            if(transaction.getId().equals(id)) {
                return transaction;
            }
        }
        return null;
    }

    @Override
    public void depositMoney(Long accountNo, Double amountToBeDeposited) {
      Account account = accountService.getAccountByAccountNo(accountNo);
      account.setAmount(account.getAmount() + amountToBeDeposited);
    }

    @Override
    public void withdrawMoney(Long accountNo, Double amountToBeWithdrawn) {
        Account account = accountService.getAccountByAccountNo(accountNo);
        account.setAmount(account.getAmount() - amountToBeWithdrawn);
    }

    @Override
    public void transferMoeny(Long toAccountNo, Long fromAccountNo, Double amountToBeTransferred) {
        Account toAccount = accountService.getAccountByAccountNo(toAccountNo);
        Account fromAccount = accountService.getAccountByAccountNo(fromAccountNo);

        fromAccount.setAmount(fromAccount.getAmount() - amountToBeTransferred);
        toAccount.setAmount(toAccount.getAmount() + amountToBeTransferred);
    }
}
