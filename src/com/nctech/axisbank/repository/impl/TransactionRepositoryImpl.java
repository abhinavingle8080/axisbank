package com.nctech.axisbank.repository.impl;

import com.nctech.axisbank.database.TransactionDB;
import com.nctech.axisbank.dto.Transaction;
import com.nctech.axisbank.repository.TransactionRepository;

public class TransactionRepositoryImpl implements TransactionRepository {
    @Override
    public void save(Transaction transaction) {
        Integer size = TransactionDB.transactions.length + 1;
        Transaction[] tempArr = new Transaction[size];
        for (int i = 0; i < (TransactionDB.transactions.length); i++) {
            tempArr[i] = TransactionDB.transactions[i];
        }
        tempArr[size - 1] = transaction;
        TransactionDB.transactions = tempArr;
    }

    @Override
    public Transaction[] getAll() {
        return TransactionDB.transactions;
    }
}
