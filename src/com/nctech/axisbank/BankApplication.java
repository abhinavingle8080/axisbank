package com.nctech.axisbank;

import com.nctech.axisbank.database.AccountDB;
import com.nctech.axisbank.dto.Account;

public class BankApplication {
    static Account account = new Account(1, "abhinav", 1001L, 2000.00);
    static Account account2 = new Account(1, "Sagar", 1001L, 2000.00);

    public static void main(String[] args) {
        AccountDB.accounts[0] = account;
        AccountDB.accounts[1] = account2;

        System.out.println(AccountDB.accounts[1]);
    }
}
