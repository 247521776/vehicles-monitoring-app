package com.alten.vehicle.vehicleservice.service;

import com.alten.vehicle.vehicleservice.model.Vehicle;
import com.alten.vehicle.vehicleservice.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    public Optional<Vehicle> find(String vehicleId) {

        if (vehicleId == null || "".equals(vehicleId.trim())) {
            throw new IllegalArgumentException("vehicle Id is missing");
        }

        return vehicleRepository.findById(vehicleId);
    }



}