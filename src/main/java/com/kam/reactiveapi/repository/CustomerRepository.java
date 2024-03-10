package com.kam.reactiveapi.repository;

import com.kam.reactiveapi.model.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CustomerRepository extends ReactiveCrudRepository<Customer, Integer> {
    Flux<Customer> findAllByFirstnameIgnoreCase(String firstname);

}
