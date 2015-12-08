package com.mabrupi.springlearning.rest;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mabrupi.springlearning.mail.MailSender;

@RestController
public class MailController {

    @Resource
    private MailSender mailSender;

    @RequestMapping("/sendMail")
    public String sendMail() {
        mailSender.send("some_email@gmail.com", "Some subject", "Very important subject");
        return "Email sent";
    }
}
