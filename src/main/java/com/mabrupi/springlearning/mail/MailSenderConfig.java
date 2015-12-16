package com.mabrupi.springlearning.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.mail.javamail.JavaMailSender;

import com.mabrupi.springlearning.external.DemoObject;

@Configuration
public class MailSenderConfig {

    @Bean
    public MailSender mockMailSender(DemoObject demoObject) {
        MockMailSender mailSender = new MockMailSender();
        mailSender.setDemoObject(demoObject);
        return mailSender;
    }

    @Bean
    @Primary
    public MailSender smtpMailSender(JavaMailSender javaMailSender) {
        SmtpMailSender mailSender = new SmtpMailSender();
        mailSender.setJavaMailsender(javaMailSender);
        return mailSender;
    }

    @Bean
    public DemoObject demoObject() {
        return new DemoObject();
    }
}
