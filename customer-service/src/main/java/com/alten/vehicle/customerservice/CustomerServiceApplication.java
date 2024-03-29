package com.alten.vehicle.customerservice;

import com.alten.vehicle.customerservice.model.Customer;
import com.alten.vehicle.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }


    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new Customer(1,"Kalles Grustransporter AB", "Cementvägen 8, 111 11 Södertälje"));
            repository.save(new Customer(2,"Johans Bulk AB", "Cementvägen 8, 111 11 Södertälje"));
            repository.save(new Customer(3,"Haralds Värdetransporter AB", "Budgetvägen 1, 333 33 Uppsala"));


        };
    }
}
