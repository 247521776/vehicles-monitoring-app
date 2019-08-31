package com.alten.vehicle.customerservice.contoller;


import com.alten.vehicle.customerservice.model.Customer;
import com.alten.vehicle.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/customer")
public class CustomerController {


    @Autowired
    private CustomerService customerService;


    @GetMapping
    public ResponseEntity<List<Customer>> findAll() {
        List<Customer> customers = customerService.findAll();
        if (customers.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(customers);
    }


    @GetMapping("/{customerId}")
    public ResponseEntity<Customer> find(
            @PathVariable("customerId") Long customerId) {
        return customerService.find(customerId).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
