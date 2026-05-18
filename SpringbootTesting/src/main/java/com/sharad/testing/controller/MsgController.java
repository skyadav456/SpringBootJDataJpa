package com.sharad.testing.controller;

import com.sharad.testing.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
    @Autowired
    private MsgService msgService;

    @GetMapping("/msg")
    public String getMsg(){
        String msg= msgService.getMessage();
        if(msg!=null && !msg.isEmpty()){
            msgService.sendEmail();
            return msg.toUpperCase();
        }
        return null;

    }

}
