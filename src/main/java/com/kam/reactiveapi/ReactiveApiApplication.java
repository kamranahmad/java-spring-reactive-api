package com.kam.reactiveapi;

import com.kam.reactiveapi.model.Customer;
import com.kam.reactiveapi.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveApiApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(CustomerService customerService){
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
}
