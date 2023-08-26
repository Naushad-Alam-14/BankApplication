package com.naushad.BankApplication.controller;

import com.naushad.BankApplication.model.Customer;
import com.naushad.BankApplication.model.User;
import com.naushad.BankApplication.service.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BankController {

    @Autowired
    Bank bank;

    @PostMapping("/add")
    public Customer addUser(@RequestBody User user){
        return bank.openAccount(user);
    }

    @GetMapping("/getCustomer/{acctNo}")
    public Customer getCustomer(@PathVariable String acctNo){
        return bank.findCustomerByAccountNumber(acctNo);
    }

    @DeleteMapping("/close")
    public String closeAccount(){
        System.out.println("Close method got called from browser");
        return bank.closeAccount();
    }


}
