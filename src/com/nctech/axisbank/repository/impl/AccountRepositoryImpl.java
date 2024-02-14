package com.nctech.axisbank.repository.impl;

import com.nctech.axisbank.database.AccountDB;
import com.nctech.axisbank.dto.Account;
import com.nctech.axisbank.repository.AccountRepository;

public class AccountRepositoryImpl implements AccountRepository {

    @Override
    public void save(Account account) {
        Integer size = AccountDB.accounts.length +1;
        Account[] tempArr = new Account[size];

        for (int i = 0; i < (AccountDB.accounts.length); i++) {
            tempArr[i] = AccountDB.accounts[i];
        }
        tempArr[size-1] = account;
        AccountDB.accounts = tempArr;
    }

    @Override
    public Account[] getAll() {
        return AccountDB.accounts;
    }
}
