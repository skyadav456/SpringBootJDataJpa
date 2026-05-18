package com.sharad.testing.service;

import org.springframework.stereotype.Service;

@Service
public class MsgService {

    public String getMessage(){
        return "Welcome To my Java studio";
    }

    public void sendEmail(){
        // some SMTP code to send email
        System.out.println("Email sent successfully");
    }
}
