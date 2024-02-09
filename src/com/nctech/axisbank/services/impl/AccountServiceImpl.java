package com.nctech.axisbank.services.impl;

import com.nctech.axisbank.database.AccountDB;
import com.nctech.axisbank.dto.Account;
import com.nctech.axisbank.repository.AccountRepository;
import com.nctech.axisbank.repository.impl.AccountRepositoryImpl;
import com.nctech.axisbank.services.AccountService;

public class AccountServiceImpl implements AccountService {

    AccountRepository accountRepository = new AccountRepositoryImpl();

    @Override
    public Long save(String name, Double amount) {
        Integer id = accountRepository.getAll().length + 1;
        Long accountNo = accountRepository.getAll().length + 1001L;
        Account account = new Account(id, name, accountNo, amount);
        return accountNo;
    }

    @Override
    public void update(Long accountNo, String name, Double amount) {
        Account accountToBeUpdated = getAccountByAccountNo(accountNo);
        accountToBeUpdated.setName(name);
        accountToBeUpdated.setAmount(amount);
    }

    @Override
    public Account[] getAll() {
        return accountRepository.getAll();
    }

    @Override
    public Account getAccountById(Integer id) {
        for (Account account: accountRepository.getAll()){
            if(account.getId().equals(id)){
                return account;
            }
        }
        return null;
    }

    @Override
    public Account getAccountByAccountNo(Long accountNo) {
        for(Account account: accountRepository.getAll()){
            if(account.getAccountNumber().equals(accountNo)){
                return account;
            }
        }
        return null;
    }

    @Override
    public void delete(Long accountNo) {
       Account existingAccount = getAccountByAccountNo(accountNo);
       if(existingAccount != null){
           Account[] accounts = getAll();
           Account[] tempArray = new Account[accounts.length -1];

           Integer index=0;
           for (Account account: accounts){
               if (!account.getAccountNumber().equals(accountNo)) {
                   tempArray[index] = account;
                   index++;
               }
               AccountDB.accounts = tempArray;
           }
       }
    }
}
