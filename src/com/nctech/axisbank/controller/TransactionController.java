package com.nctech.axisbank.controller;

import com.nctech.axisbank.services.TransactionService;
import com.nctech.axisbank.services.impl.TransactionServiceImpl;
import com.nctech.axisbank.util.InputUtil;
import com.nctech.axisbank.util.PrintUtil;

public class TransactionController {

    InputUtil input = new InputUtil();
    TransactionService transactionService = new TransactionServiceImpl();
    public void depositMoney(){
        PrintUtil.printDivider();
        Long accountNo = input.inputLong("Enter your accountNo: ");
        Double amount = input.inputDouble("Enter the amount: ");
        transactionService.depositMoney(accountNo, amount);
        System.out.println("Money deposited successfully");
    }

    public void withdrawMoeny(){
        PrintUtil.printDivider();
        Long accountNo = input.inputLong("Enter your accountNo: ");
        Double amount = input.inputDouble("Enter the amount: ");
        transactionService.withdrawMoney(accountNo, amount);
        System.out.println("Here you go "+ amount);
    }

    public void transferMoney(){
        PrintUtil.printDivider();
        Long toAccountNo = input.inputLong("Enter to-account-no: ");
        Long fromAccountNo = input.inputLong("Enter from-account-no: ");
        Double amount = input.inputDouble("Enter amount: ");

        transactionService.transferMoeny(toAccountNo, fromAccountNo, amount);
    }
}
