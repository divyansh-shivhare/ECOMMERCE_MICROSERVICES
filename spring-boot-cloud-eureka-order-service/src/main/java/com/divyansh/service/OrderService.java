package com.divyansh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divyansh.modal.Notification;
import com.divyansh.modal.OrderDetails;
import com.divyansh.repository.OrderDetailsRepository;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderDetailsRepository orderRepository;

    @Autowired
    private NotificationServiceClient notificationServiceClient;

    public OrderDetails save(OrderDetails order){
        OrderDetails orderDetails = orderRepository.save(order);

        Notification notification = new Notification();
        notification.setUserId(order.getUserId());
        notification.setNotificationType("SMS");
        notification.setMobileNo("99 99 99 99 99");
        notificationServiceClient.sendNotification(notification);

        return orderDetails;
    }

    public List<OrderDetails> findOrderByUserId(Long userId){
        return this.orderRepository.findOrdersByUserId(userId);
    }
}
