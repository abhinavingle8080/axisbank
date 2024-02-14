package com.nctech.axisbank.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {
    static Scanner scanner = new Scanner(System.in);

    public String inputString(String message) {
        String input = "";
        Boolean isError = false;
        do {
            System.out.print(message);
            try {
                input = scanner.next();
                isError = false;
            } catch (InputMismatchException e) {
                isError = true;
                System.out.println("Error ->  Please Enter a valid String");
                scanner.nextLine(); // for buffer removal
            }
        } while (isError);
        return input;
    }

    public Double inputDouble(String message) {
        Double input = 0.0;
        Boolean isError = false;
        do {
            System.out.print(message);
            try {
                input = scanner.nextDouble();
                isError = false;
            } catch (InputMismatchException e) {
                isError = true;
                System.out.println("Error ->  Please Enter a valid Double");
                scanner.nextLine(); // for buffer removal
            }
        } while (isError);
        return input;
    }

    public Integer inputInteger(String message) {
        Integer input = 0;
        Boolean isError = false;
        do {
            System.out.print(message);
            try {
               input = scanner.nextInt();
                isError = false;
            } catch (InputMismatchException e) {
                isError = true;
                System.out.println("Error ->  Please Enter a valid Integer");
                scanner.nextLine(); // for buffer removal
            }
        } while (isError);
        return input;
    }

    public Long inputLong(String message) {
        Long input = 0L;
        Boolean isError = false;
        do {
            System.out.print(message);
            try {
                input = scanner.nextLong();
                isError = false;
            } catch (InputMismatchException e) {
                isError = true;
                System.out.println("Error ->  Please Enter a valid Long");
                scanner.nextLine(); // for buffer removal
            }
        } while (isError);
        return input;
    }
}
