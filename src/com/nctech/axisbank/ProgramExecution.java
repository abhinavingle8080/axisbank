package com.nctech.axisbank;

import com.nctech.axisbank.controller.AccountController;
import com.nctech.axisbank.controller.TransactionController;
import com.nctech.axisbank.util.InputUtil;
import com.nctech.axisbank.util.PrintUtil;

public class ProgramExecution {
    InputUtil inputUtil = new InputUtil();
    AccountController accountController = new AccountController();
    TransactionController transactionController = new TransactionController();
    public void runApplication() {
        PrintUtil.printHeader();
        Integer option = 0;
        do{
            PrintUtil.printMenu();
            option = inputUtil.inputInteger("Choose you Service: ");

            switch (option) {
                case 1:
                    accountController.createAccount();
                    break;
                case 2:
                    transactionController.depositMoney();
                    break;
                case 3:
                    transactionController.withdrawMoeny();
                    break;
                case 4:
                    transactionController.transferMoney();
                case 5:
                    accountController.checkBalance();
                    break;
                case 6:
                    accountController.updateAccount();
                    break;
                case 7:
                    accountController.deleteAccount();
                    break;
                case 8:
                    accountController.seeAccountDetails();
                    break;
                default:
                    System.out.println("The service you choose is currently not available");
            }
        } while (option != 9);
    }
}
