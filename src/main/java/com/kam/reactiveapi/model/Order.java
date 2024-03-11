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
@Table(name="Orders")
public class Order {
    @Id
    private Integer id;
    private String productname;
    private int customerid;
    private int quantity;
    private int productid;
    private BigDecimal ordertotal;
}
