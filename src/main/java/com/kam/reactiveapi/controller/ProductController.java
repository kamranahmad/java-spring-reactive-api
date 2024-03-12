package com.kam.reactiveapi.controller;

import com.kam.reactiveapi.model.Customer;
import com.kam.reactiveapi.model.Product;
import com.kam.reactiveapi.service.CustomerService;
import com.kam.reactiveapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/products/v1")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    Mono<Product> save(@RequestBody Product product){
        return productService.save(product);
    }

    @GetMapping
    Flux<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    Mono<Product> findById(
            @PathVariable("id") Integer id) {
        return productService.findById(id);
    }
}

