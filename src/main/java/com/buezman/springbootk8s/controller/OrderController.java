package com.buezman.springbootk8s.controller;

import com.buezman.springbootk8s.entity.Order;
import com.buezman.springbootk8s.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/orders")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public Order addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }

    @GetMapping
    public List<Order> getOrders(){
        return orderService.getOrders();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id){
        return orderService.getOrderById(id);
    }
}
