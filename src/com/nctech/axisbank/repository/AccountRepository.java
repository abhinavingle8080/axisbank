package com.nctech.axisbank.repository;

import com.nctech.axisbank.dto.Account;

public interface AccountRepository {
    void save(Account account);

    Account[] getAll();
}
