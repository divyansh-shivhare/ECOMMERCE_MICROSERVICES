package com.divyansh.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divyansh.modal.Notification;
import com.divyansh.repository.NotificationRepository;

@Service
public class NotificationService {

    private static final Logger log = LoggerFactory.getLogger(NotificationService.class);

    @Autowired
    private NotificationRepository notificationRepository;

    public Notification save(Notification notification){
        log.info("Inside the save method of NotificationService");
        // todo : write some logic to send read notification like email, sms ect
        return notificationRepository.save(notification);
    }
}
