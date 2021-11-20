package com.dis.notification.controller;

import com.dis.notification.domain.Notification;
import com.dis.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping(value = "sendNotification")
    public void sendNotification(@RequestBody Notification notification) {
        notificationService.sendNotificationToMq(notification);
    }
}
