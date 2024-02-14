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
        accountRepository.save(account);
        return accountNo;
    }

    @Override
    public void update(Long accountNo, String name) {
        Account accountToBeUpdated = getAccountByAccountNo(accountNo);
        if(accountToBeUpdated == null){
            System.out.println("Your Account Does No Exits");
        } else{
            accountToBeUpdated.setName(name);
//        accountToBeUpdated.setAmount(amount);
        }
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
    public Boolean delete(Long accountNo) {
       Boolean isDeleted = false;
           Account[] accounts = getAll();
           Account[] tempArray = new Account[accounts.length -1];
//           Integer index=0;
           for (int i = 0; i < (accounts.length); i++ ){
               if (!accounts[i].getAccountNumber().equals(accountNo)) {
                   tempArray[i] = accounts[i];
//                   index++;
               }
               AccountDB.accounts = tempArray;
           }
           isDeleted = true;
       return isDeleted;
    }
}
