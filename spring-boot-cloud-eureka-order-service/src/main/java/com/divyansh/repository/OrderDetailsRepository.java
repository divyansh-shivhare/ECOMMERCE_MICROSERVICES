package com.divyansh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.divyansh.modal.OrderDetails;

import java.util.List;

@Repository
public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Long> {
    List<OrderDetails> findOrdersByUserId(Long userId);
}
