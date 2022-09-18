package com.divyansh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.divyansh.modal.Notification;

@FeignClient(value = "notification-service" , fallback = NotificationServiceClientFallback.class)
public interface NotificationServiceClient {

    @PostMapping(value = "/notification/")
    Notification sendNotification(@RequestBody Notification orderDetails);

}


@Component
class NotificationServiceClientFallback implements NotificationServiceClient{

    @Override
    public Notification sendNotification(Notification orderDetails) {
        return new Notification();
    }
}