package com.kam.reactiveapi.controller;

import com.kam.reactiveapi.model.Customer;
import com.kam.reactiveapi.model.Order;
import com.kam.reactiveapi.service.CustomerService;
import com.kam.reactiveapi.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/orders/v1")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    Mono<Order> save(@RequestBody Order order){
        return orderService.save(order);
    }

    @GetMapping
    Flux<Order> findAll() {
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    Mono<Order> findById(
            @PathVariable("id") Integer id) {
        return orderService.findById(id);
    }
}

