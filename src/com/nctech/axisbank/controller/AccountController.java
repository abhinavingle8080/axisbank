package com.nctech.axisbank.controller;

import com.nctech.axisbank.services.AccountService;
import com.nctech.axisbank.services.impl.AccountServiceImpl;
import com.nctech.axisbank.util.InputUtil;

public class AccountController {

    InputUtil inputUtil = new InputUtil();
    AccountService accountService = new AccountServiceImpl();

    public void createAccount () {
        String name = inputUtil.inputString("Enter you name: ");
        Double amount = inputUtil.inputDouble("Enter amount: ");
        Long accountNo = accountService.save(name, amount);
        System.out.println("Here's your generated Account No: " + accountNo);
        System.out.println("Keep it safe");
    }

}
