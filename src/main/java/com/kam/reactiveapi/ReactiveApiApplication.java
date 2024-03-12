package com.kam.reactiveapi;

import com.kam.reactiveapi.model.Customer;
import com.kam.reactiveapi.model.Order;
import com.kam.reactiveapi.model.Product;
import com.kam.reactiveapi.service.CustomerService;
import com.kam.reactiveapi.service.OrderService;
import com.kam.reactiveapi.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class ReactiveApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveApiApplication.class, args);
	}


//	//loading customers to customer table
//	@Bean
//	public CommandLineRunner commandLineRunner1(CustomerService customerService){
//		return args -> {
//			for (int i=0; i<100; i++){
//				customerService.save(
//						Customer.builder().firstname("CustomerFirstname" + i)
//								.lastname("Lastname" + i)
//								.zipcode(10028 + i)
//								.build()
//				).subscribe();
//			}
//		};
//	}
//
//	//	loading products to product table
//	@Bean
//	public CommandLineRunner commandLineRunner2(ProductService productService){
//		return args -> {
//			for (int i=0; i<100; i++){
//				productService.save(
//						Product.builder().productname("TestProduct" + i)
//								.productdescription("description " + i)
//								.price(new BigDecimal(199.99))
//								.build()
//				).subscribe();
//			}
//		};
//	}
//	//loading order to order table
//	@Bean
//	public CommandLineRunner commandLineRunner3(OrderService orderService){
//		return args -> {
//			for (int i=0; i<100; i++){
//				orderService.save(
//						Order.builder()
//								.customerid(1+i)
//								.ordertotal(new BigDecimal(1999.99))
//								.quantity(10)
//								.productid(1218232)
//								.productname("Laptop")
//								.build()
//				).subscribe();
//			}
//		};
//	}

}
