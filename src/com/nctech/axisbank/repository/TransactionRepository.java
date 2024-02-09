package com.nctech.axisbank.repository;

import com.nctech.axisbank.dto.Transaction;

public interface TransactionRepository {
    void save(Transaction transaction);

    Transaction[] getAll();
}
