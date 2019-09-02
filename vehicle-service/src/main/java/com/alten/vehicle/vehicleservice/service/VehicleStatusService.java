package com.alten.vehicle.vehicleservice.service;

import com.alten.vehicle.vehicleservice.model.Vehicle;
import com.alten.vehicle.vehicleservice.model.VehicleStatus;
import com.alten.vehicle.vehicleservice.repository.VehicleRepository;
import com.alten.vehicle.vehicleservice.repository.VehicleStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleStatusService {

    @Autowired
    private VehicleStatusRepository vehicleStatusRepository;

    public List<VehicleStatus> findAll() {
        return vehicleStatusRepository.findAll();
    }





}