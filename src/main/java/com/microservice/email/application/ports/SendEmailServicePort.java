package com.microservice.email.application.ports;


import com.microservice.email.application.domain.Email;

public interface SendEmailServicePort {

    void sendEmailSmtp(Email email);
}