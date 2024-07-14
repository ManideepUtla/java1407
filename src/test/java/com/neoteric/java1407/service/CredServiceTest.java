package com.neoteric.java1407.service;

import com.neoteric.java1407.creddemo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CredServiceTest {
    @Test
    public void registration(){


        Customer customer=new Customer();
        customer.userNameOrLoginId="Manideep";
        customer.password="xxxxx";
        customer.id="N24";
        customer.Name="Manideep Utla";
        customer.dOB="30-10-2002";
        customer.mobileNo="9985533134";



        InterestRate interstRate=new InterestRate();

        interstRate.accountType="Savings";
        interstRate.interstForSavings=2.5;
        interstRate.intersestForCurrent=3.0;
        interstRate.interestForFixedDeposit=2.8;
        interstRate.startDate=new Date();
        interstRate.endDate=new Date();

        Address address=new Address();
        address.flatNo="g1";
        address.street="Mana street";
        address.landmark="mana mart";
        address.pincode="500032";
        address.city="hyd";



        IfscCode ifscCode=new IfscCode();
        ifscCode.code="SBIN23456789";
        ifscCode.address=address;



        Account account=new Account();
        account.accountNo="876543287654";
        account.interestrate= interstRate;
        account.address=address;
        account.ifscCode=ifscCode;
        account.availableBal=50000;
        account.currentBal=40000;

        CredService service=new CredService();
        Otp otp =service.registeration(customer);

        service.registeration(customer);


        Assertions.assertEquals(180605,otp.otpNo);
        Assertions.assertNotNull(customer);




    }

}