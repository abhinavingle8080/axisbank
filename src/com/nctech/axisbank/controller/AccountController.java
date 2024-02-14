package com.nctech.axisbank.controller;

import com.nctech.axisbank.dto.Account;
import com.nctech.axisbank.services.AccountService;
import com.nctech.axisbank.services.impl.AccountServiceImpl;
import com.nctech.axisbank.util.InputUtil;
import com.nctech.axisbank.util.PrintUtil;

public class AccountController {

    InputUtil inputUtil = new InputUtil();
    AccountService accountService = new AccountServiceImpl();

    public void createAccount () {
        PrintUtil.printDivider();
        String name = inputUtil.inputString("Enter you name: ");
        Double amount = inputUtil.inputDouble("Enter amount: ");
        Long accountNo = accountService.save(name, amount);
        System.out.println("Here's your generated Account No: " + accountNo);
        System.out.println("Keep it safe");
    }

    public void updateAccount () {
        PrintUtil.printDivider();
        Long accountNo = inputUtil.inputLong("Enter your account No: ");
        String name =  inputUtil.inputString("Enter you new name: ");
        accountService.update(accountNo, name);
    }

    public void checkBalance() {
        PrintUtil.printDivider();
        Long accountNo = inputUtil.inputLong("Enter your account No: ");
        Account account = accountService.getAccountByAccountNo(accountNo);
        if ( account != null) {
            System.out.println(account.getName()+ " your balance is " + account.getAmount()+"rs.");
        } else {
            System.out.println("Sorry, we couldn't find your account");
        }
    }

    public void deleteAccount() {
        PrintUtil.printDivider();
        Boolean isDeleted = false;
        Long accountNo = inputUtil.inputLong("Enter your account No: ");
        String confirmation = inputUtil.inputString("Are you sure?(Y or N) -> ");
        if(confirmation.equals("Y") || confirmation.equals("y")){
           isDeleted = accountService.delete(accountNo);
            if(isDeleted) {
                System.out.println("Your account has been deleted, we will miss you");
            } else {
                System.out.println("Fortunately, Something went wrong");
            }
        }
    }

    public void seeAccountDetails() {
        PrintUtil.printDivider();
        Long accountNo = inputUtil.inputLong("Enter your account No: ");
        Account account = accountService.getAccountByAccountNo(accountNo);
        System.out.println("Account No: "+ account.getAccountNumber());
        System.out.println("Account Holder: "+ account.getName());
        System.out.println("Available balance: " + account.getAmount());
    }
}
