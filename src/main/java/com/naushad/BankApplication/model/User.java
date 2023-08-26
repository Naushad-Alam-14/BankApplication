package com.naushad.BankApplication.model;

import java.util.Date;
import java.util.Objects;

public class User {
    private String name;
    private String address;
    private String mobileNo;
    private String aadhaarNo;
    private Date dateOfBirth;

    public User(String name, String address, String mobileNo, String aadhaarNo, Date dateOfBirth) {
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;
        this.aadhaarNo = aadhaarNo;
        this.dateOfBirth = dateOfBirth;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(String aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMobileNo(String mobileNo){
        if(mobileNo.startsWith("+91"))
            this.mobileNo = mobileNo;
        else
            this.mobileNo = "+91" + mobileNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    @Override
    public String toString() {
        return "model.User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", aadhaarNo='" + aadhaarNo + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

