package com.naushad.BankApplication.service;

import com.naushad.BankApplication.model.Customer;
import com.naushad.BankApplication.model.User;

public interface Bank {
    Customer openAccount(User user);
    String closeAccount(String acctNo);
    void deposit();
    double withdrawal();
    String transfer();
    double checkBalance();

    Customer findCustomerByAccountNumber(String acctNo);
}