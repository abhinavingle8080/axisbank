package com.nctech.axisbank;

import com.nctech.axisbank.controller.AccountController;
import com.nctech.axisbank.util.InputUtil;
import com.nctech.axisbank.util.PrintUtil;

public class ProgramExecution {
    InputUtil inputUtil = new InputUtil();
    AccountController accountController = new AccountController();
    public void runApplication() {
        PrintUtil.printHeader();
        PrintUtil.printMenu();
        Integer option = inputUtil.inputInteger("Choose you Service: ");

        switch (option) {
            case 1:
                accountController.createAccount();
                break;
            default:
                System.out.println("The service you choose is currently not available");
        }
    }
}
