package com.divyansh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divyansh.modal.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification,Long> {
}
