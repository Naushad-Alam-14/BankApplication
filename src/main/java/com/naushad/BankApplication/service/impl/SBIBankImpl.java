package com.naushad.BankApplication.service.impl;


import com.naushad.BankApplication.model.Customer;
import com.naushad.BankApplication.model.User;
import com.naushad.BankApplication.repository.SBIRepository;
import com.naushad.BankApplication.service.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SBIBankImpl implements Bank {

    @Autowired
    SBIRepository sbiRepository;

    public Customer openAccount(User user){
        // check existing account/ dedupe
        return sbiRepository.addAccount(user);
    }
    public String closeAccount(String acctNo){
        sbiRepository.closeAccount(acctNo);
        return "Account has been closed successfully";
    }
    public void deposit(){

    }
    public double withdrawal(){
        return 0;
    }
    public String transfer(){
        return null;
    }
    public double checkBalance(){

        return 0;
    }

    public Customer findCustomerByAccountNumber(String acctNo){
        return sbiRepository.findCustomerByAccountNumber(acctNo);
    }
}

