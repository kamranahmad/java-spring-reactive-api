package com.kam.reactiveapi.service;

import com.kam.reactiveapi.model.Customer;
import com.kam.reactiveapi.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    public Flux<Customer> findAll() {
        return customerRepository.findAll();

    }

    @Cacheable(cacheNames = "customer_cache")
    public Mono<Customer> findById(Integer id) {
        System.out.println("CustomerService.findById " + id);

        return customerRepository.findById(id);
    }

    public Mono<Customer> save(Customer customer) {
        return customerRepository.save(customer);
    }
}
