package com.neoteric.java1407.service;

import com.neoteric.java1407.creddemo.Customer;
import com.neoteric.java1407.creddemo.Otp;

import java.sql.Time;

public class CredService {
    public Otp registeration(Customer mobileNo){
        Otp otp=new Otp();// Only obj reference only knows the loaction of obj in the RAM.
        otp.mobileNo="9985533134";
        otp.customerId="N24";
        otp.otpNo="180605";
        otp.expireTime=new Time(2);


    return otp;
    }
}
