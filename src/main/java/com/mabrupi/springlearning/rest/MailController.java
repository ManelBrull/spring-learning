package com.mabrupi.springlearning.rest;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mabrupi.springlearning.mail.MailSender;

@RestController
public class MailController {

    private MailSender mailSender;

    @Resource(name = "smtpMailSender")
    public void setMailSender(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    @RequestMapping("/sendMail")
    public String sendMail() {
        mailSender.send("some_email@gmail.com", "Some subject", "Very important subject");
        return "Email sent";
    }
}
