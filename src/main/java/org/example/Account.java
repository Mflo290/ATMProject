package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");


    /* Set the customer number */
    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    /* Get the customer number */
    public int getCustomerNumber() {
        return customerNumber;
    }

    /* Set the pin number */
    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    /* Get the pin number */
    public int getPinNumber() {
        return pinNumber;
    }

    /* Get Checking Account Balance */
    public double getCheckingBalance() {
        return checkingBalance;
    }

    /* Get Saving Account Balance */
    public double getSavingBalance() {
        return savingBalance;
    }

    /* Calculate Checking Account withdrawal */

}
