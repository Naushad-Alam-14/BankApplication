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

    public void closeAccount(String acctNo) {
        map.remove(acctNo);
        System.out.println(map);
    }

    public boolean checkUserIsPresentOrNot(String aadhaarNo){

        for(Customer cust : map.values()){
            if(aadhaarNo.equals(cust.getUser().getAadhaarNo())){
                return true;
            }
        }

        return false;
    }
}
