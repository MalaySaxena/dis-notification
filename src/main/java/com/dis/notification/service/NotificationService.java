package com.dis.notification.service;

import com.dis.notification.domain.Notification;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private RabbitMqSender rabbitMqSender;

    public void sendNotificationToMq(Notification notification) {
        rabbitMqSender.send(notification);
    }
}
