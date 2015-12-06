package com.mabrupi.springlearning.mail;

public interface MailSender {

    abstract void send(String to, String subject, String body);

}