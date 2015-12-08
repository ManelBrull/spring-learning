package com.mabrupi.springlearning.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class MockMailSender implements MailSender {

    private static final Log log = LogFactory.getLog(MockMailSender.class);

    /* (non-Javadoc)
     * @see com.mabrupi.springlearning.mail.MailSender#send(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public void send(String to, String subject, String body) {
        log.info("Sending email to: " + to);
        log.info("Subject: " + subject);
        log.info("Body: " + body);
    }
}
