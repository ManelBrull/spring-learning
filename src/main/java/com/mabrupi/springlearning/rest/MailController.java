package com.mabrupi.springlearning.rest;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mabrupi.springlearning.mail.MailSender;

@RestController
public class MailController {

    private MailSender mailSender;

    @Autowired
    public MailController(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    @RequestMapping("/sendMail")
    public String sendMail() throws MessagingException {
        mailSender.send("some_email@gmail.com", "Some subject", "Very important subject");
        return "Email sent";
    }
}
