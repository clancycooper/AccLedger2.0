package com.pluralsight;

import java.io.IOException;
import java.util.Scanner;

import static com.pluralsight.HomeFunctions.*;
import static com.pluralsight.LedgerFunctions.*;
import static com.pluralsight.Reader.readTransactions;
import static com.pluralsight.ReportsFunctions.*;


public class AccountingLedgerApp {
    public static Scanner scanner = new Scanner(System.in);
    public static void homeScreen() throws IOException {
        System.out.println("Good afternoon, Clancy. How can I assist you?");
        System.out.println(" D) Add a Deposit \n P) Make a Payment \n L) View your Ledger \n X) Exit");
        String clancysChoice = scanner.nextLine().toUpperCase().trim();
        switch(clancysChoice) {
            case "D": addDeposit();
            case "P": makePayment();
            case "L": ledgerScreen();
            case "X": System.exit(0);
            default:
                scanner.nextLine();
                System.out.println("I'm having a hard time finding what you're looking for. Please try again, make sure your response is D, P, L, or X.");
                homeScreen();
        }
    }

    public static void ledgerScreen() throws IOException {
        System.out.println("Welcome to your Ledger, which transaction history would you like to view?");
        System.out.println(" A) Display all transactions \n D) Display all deposits \n P) Display payment history \n R) Search my Reports \n H) Return Home");
        String clancysStatements = scanner.nextLine().toUpperCase().trim();
        switch(clancysStatements) {
            case "A": displayAll();
            case "D": displayDeposits();
            case "P": displayPayments();
            case "R": reportsScreen();
            case "H": homeScreen();
            default:
                System.out.println("I'm having a hard time finding what you're looking for. Please try again, make sure your response is A, D, P, or R.");
                ledgerScreen();
        }
    }

    public static void reportsScreen() throws IOException {
        System.out.println("Welcome to your Reports, how would you like to view your statements?");
        System.out.println(" 1) Month to Date \n 2) Previous Month \n 3) Year to Date \n 4) Previous Year \n 5) Search by Vendor \n 0) Return Home");
        int clancysReports = scanner.nextInt();
        switch(clancysReports) {
            case 1: monthToDate();
            case 2: previousMonth();
            case 3: yearToDate();
            case 4: previousYear();
            case 5: scanner.nextLine();
                searchByVendor();
            case 0: homeScreen();
            default:
                System.out.println("I'm having a hard time finding what you're looking for. Please try again, make sure your response is 1, 2, 3, 4, 5, or 0");
                reportsScreen();
        }
    }
}

