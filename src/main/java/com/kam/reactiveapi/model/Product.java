package com.kam.reactiveapi.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Table(name="Products")
public class Product {
    @Id
    private Integer id;
    private String productname;
    private String productdescription;
    private BigDecimal price;

}
