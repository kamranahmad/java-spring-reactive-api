package com.kam.reactiveapi.repository;

import com.kam.reactiveapi.model.Customer;
import com.kam.reactiveapi.model.Order;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface OrderRepository extends ReactiveCrudRepository<Order, Integer> {
    Flux<Order> findAllByProductnameIgnoreCase(String productname);

}
