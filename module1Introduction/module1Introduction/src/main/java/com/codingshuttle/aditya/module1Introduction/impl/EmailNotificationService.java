package com.codingshuttle.aditya.module1Introduction.impl;

import com.codingshuttle.aditya.module1Introduction.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email sending...."+message);
    }
}
