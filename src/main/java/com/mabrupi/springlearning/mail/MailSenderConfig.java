package com.mabrupi.springlearning.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mabrupi.springlearning.external.DemoObject;

@Configuration
public class MailSenderConfig {

    @Bean
    @Profile("dev")
    public MailSender mockMailSender() {
        MockMailSender mailSender = new MockMailSender();
        mailSender.setDemoObject(demoObject());
        return mailSender;
    }

    @Bean
    @Profile("!dev")
    public MailSender smtpMailSender() {
        SmtpMailSender mailSender = new SmtpMailSender();
        mailSender.setDemoObject(demoObject());
        return mailSender;
    }

    @Bean
    public DemoObject demoObject() {
        return new DemoObject();
    }
}
