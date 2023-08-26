package com.naushad.BankApplication.repository;

import com.naushad.BankApplication.model.Customer;
import com.naushad.BankApplication.model.User;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


@Repository
public class SBIRepository {

    Map<String, Customer> map = new HashMap<>();

    public Customer addAccount(User user) {
        Customer customer = new Customer(user, generateAccountNo(), "SBI");
        map.put(customer.getAcctNo(),customer);
        return customer;
    }

    private String generateAccountNo() {
        Random random = new Random();
        return  new Date().getTime() + "-" + random.nextInt(1000);
    }

    public Customer findCustomerByAccountNumber(String acctNo){
        return map.get(acctNo);
    }
}
