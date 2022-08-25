package com.buezman.springbootk8s.repository;

import com.buezman.springbootk8s.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
