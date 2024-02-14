package com.nctech.axisbank.util;

public class PrintUtil {
    public static void printHeader() {
        System.out.println("""
                ===============================================
                               BANK APP
                ===============================================
                """);
    }
    public static void printMenu(){
        System.out.println("""
                1] A/C Creation
                2] Deposit Money
                3] Withdraw Money
                4] Transfer Money
                5] Check Balance
                6] Update Account Details
                7] Delete Account
                8] See Account Details
                9] Exit
                """);
    }

    public static void printDivider() {
        System.out.println("===============================================");
    }
}
