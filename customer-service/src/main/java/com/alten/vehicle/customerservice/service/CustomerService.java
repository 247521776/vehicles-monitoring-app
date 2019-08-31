package com.alten.vehicle.customerservice.service;

import com.alten.vehicle.customerservice.modle.Customer;
import com.alten.vehicle.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Optional<Customer> find(Long customerId) {

        if (null == customerId) {
            throw new IllegalArgumentException("customer id is mandatory");
        }

        return customerRepository.findById(customerId);
    }
}
