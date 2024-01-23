package com.pluralsight;

import java.io.IOException;

import static com.pluralsight.AccountingLedgerApp.homeScreen;
import static com.pluralsight.Reader.readTransactions;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader.readTransactions();
        AccountingLedgerApp.homeScreen();
    }
}
