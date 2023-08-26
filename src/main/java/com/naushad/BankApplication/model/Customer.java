package com.naushad.BankApplication.model;

public class Customer {
    private User user;
    private String ifscCode;
    private String acctNo;

    private String bankName;

    public Customer(User user, String acctNo, String bankName) {
        this.user = user;
        if(bankName.equals("SBI"))
            this.ifscCode = "SBIN000123";
        else
            this.ifscCode = "PNB0000123";
        this.acctNo = acctNo;
        this.bankName = bankName;
    }

    public Customer() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName)  {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "model.Customer{" +
                "user=" + user +
                ", ifscCode='" + ifscCode + '\'' +
                ", acctNo='" + acctNo + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
