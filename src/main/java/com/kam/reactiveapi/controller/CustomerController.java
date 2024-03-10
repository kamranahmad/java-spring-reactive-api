package com.kam.reactiveapi.controller;

import com.kam.reactiveapi.model.Customer;
import com.kam.reactiveapi.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/customers/v1")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    Mono<Customer> save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @GetMapping
    Flux<Customer> findAll() {
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    Mono<Customer> findById(
            @PathVariable("id") Integer id) {
        return customerService.findById(id);
    }
}

