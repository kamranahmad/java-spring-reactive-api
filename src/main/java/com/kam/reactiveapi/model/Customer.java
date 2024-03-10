package com.kam.reactiveapi.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Table(name="Customers")
public class Customer {
    @Id
    private Integer id;
    private String firstname;
    private String lastname;
    private int zipcode;
}
