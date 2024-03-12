package com.kam.reactiveapi.repository;

import com.kam.reactiveapi.model.Customer;
import com.kam.reactiveapi.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ProductRepository extends ReactiveCrudRepository<Product, Integer> {
    Flux<Product> findAllByProductnameIgnoreCase(String productname);

}
