package com.mabrupi.springlearning.mail;

import javax.mail.MessagingException;

public interface MailSender {

    abstract void send(String to, String subject, String body) throws MessagingException;

}