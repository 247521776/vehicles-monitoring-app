package com.alten.vehicle.vehicleservice.controller;


import com.alten.vehicle.vehicleservice.model.Vehicle;
import com.alten.vehicle.vehicleservice.model.VehicleStatus;
import com.alten.vehicle.vehicleservice.repository.VehicleStatusRepository;
import com.alten.vehicle.vehicleservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicle/status")
public class VehicleStatusController {
    @Autowired
    private VehicleStatusRepository vehicleStatusRepository;


    @GetMapping
    public ResponseEntity<List<VehicleStatus>> findAll() {
        List<VehicleStatus> vehicleStatuses= vehicleStatusRepository.findAll();
        if (vehicleStatuses.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(vehicleStatuses);
    }






}