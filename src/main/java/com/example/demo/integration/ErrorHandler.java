package com.example.demo.integration;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

public class ErrorHandler {
    @ServiceActivator
    public void logError(Message<Throwable> message) {
        System.out.println("Логирую.....");
        System.out.println(message.getPayload().getMessage());
    }
}
