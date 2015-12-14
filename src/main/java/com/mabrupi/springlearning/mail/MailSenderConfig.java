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
        return new MockMailSender();
    }

    @Bean
    @Profile("!dev")
    public MailSender smtpMailSender() {
        DemoObject demoObject = new DemoObject();
        SmtpMailSender mailSender = new SmtpMailSender();
        mailSender.setDemoObject(demoObject);
        return mailSender;
    }
}
