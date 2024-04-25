package org.example;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    /* Validate Login information - customer number and pin number */

    public void getLogin() throws IOException {
        int x = 1;

        do {
            data.put(1234567, 1234);
            data.put(7654321, 4321);

            System.out.println("Welcome to the ATM Project!");
            System.out.println("Enter Your Customer Number: ");

        } while (x == 1);
    }
}
