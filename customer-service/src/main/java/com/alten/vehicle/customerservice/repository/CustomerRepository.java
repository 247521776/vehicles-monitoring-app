package com.alten.vehicle.customerservice.repository;

import com.alten.vehicle.customerservice.modle.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}