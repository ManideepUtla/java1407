package com.neoteric.java1407.creddemo;

public class Account {
    public InterestRate interestrate;// InterstRate is custom data type and these for to link the two independent objects.
    public double availableBal;
    public double currentBal;
    public String accountNo;
    public Address address; // To access the address object values in account
    public IfscCode ifscCode;

}

