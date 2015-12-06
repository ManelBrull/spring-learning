package com.mabrupi.springlearning.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mabrupi.springlearning.mail.MailSender;
import com.mabrupi.springlearning.mail.MockMailSender;

@RestController
public class MailController {

    private MailSender mailSender = new MockMailSender();

    @RequestMapping("/sendMail")
    public String sendMail() {
        mailSender.send("some_email@gmail.com", "Some subject", "Very important subject");
        return "Email sent";
    }
}
