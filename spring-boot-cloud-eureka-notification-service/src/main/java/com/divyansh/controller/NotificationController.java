package com.divyansh.controller;

import com.divyansh.modal.Notification;
import com.divyansh.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    private static final Logger log = LoggerFactory.getLogger(NotificationController.class);

    @Autowired
    private NotificationService notificationService;

    @PostMapping("")
    public Notification save(@RequestBody Notification notification) {
        return notificationService.save(notification);
    }
}
