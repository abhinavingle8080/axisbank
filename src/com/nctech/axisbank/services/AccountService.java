package com.nctech.axisbank.services;

import com.nctech.axisbank.dto.Account;

public interface AccountService {
    Long save(String name, Double amount);
    void update(Long accountNo, String name);

    Account[] getAll();
    Account getAccountById(Integer id);

    Account getAccountByAccountNo(Long accountNo);

    Boolean delete(Long accountNo);
}
