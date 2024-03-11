package com.kam.reactiveapi.service;

import com.kam.reactiveapi.model.Customer;
import com.kam.reactiveapi.model.Order;
import com.kam.reactiveapi.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.cache.annotation.Cacheable;

import java.time.Duration;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    public Flux<Order> findAll() {
        return orderRepository.findAll();

    }

    @Cacheable(cacheNames = "order_cache", cacheManager = "alternateCacheManager")
    public Mono<Order> findById(Integer id) {
        System.out.println("OrderService.findById " + id);

        return orderRepository.findById(id);
    }

    public Mono<Order> save(Order customer) {
        return orderRepository.save(customer);
    }
}
