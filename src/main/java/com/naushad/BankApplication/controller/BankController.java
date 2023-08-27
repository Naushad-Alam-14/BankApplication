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

    @GetMapping("/getCustomer/{id}/{acctNo}")
    public Customer getCustomer(@PathVariable String acctNo,@PathVariable int id){
        System.out.println(" AcctNo = " + acctNo + ", Id = " + id);
        return bank.findCustomerByAccountNumber(acctNo);
    }

    @GetMapping("/getCustomerByParam")
    public Customer getCustomerUsingParam(@RequestParam String acctNo,@RequestParam int id){
        System.out.println(" AcctNo = " + acctNo + ", Id = " + id);
        return bank.findCustomerByAccountNumber(acctNo);
    }

    @DeleteMapping("/close/{acctNo}")
    public String closeAccount(@PathVariable String acctNo){
        System.out.println("Close method got called from browser");
        return bank.closeAccount(acctNo);
    }


}
