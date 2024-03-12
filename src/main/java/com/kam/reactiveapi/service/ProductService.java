package com.kam.reactiveapi.service;

import com.kam.reactiveapi.model.Product;
import com.kam.reactiveapi.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    public Flux<Product> findAll() {
        return productRepository.findAll();

    }

    @Cacheable(cacheNames = "product_cache")
    public Mono<Product> findById(Integer id) {
        System.out.println("ProductService.findById " + id);

        return productRepository.findById(id);
    }

    public Mono<Product> save(Product product) {
        return productRepository.save(product);
    }
}
