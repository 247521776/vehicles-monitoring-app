package com.alten.vehicle.vehicleservice.controller;


import com.alten.vehicle.vehicleservice.model.Vehicle;
import com.alten.vehicle.vehicleservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;


    @GetMapping
    public ResponseEntity<List<Vehicle>> findAll() {
        List<Vehicle> vehicles = vehicleService.findAll();
        if (vehicles.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(vehicles);
    }


    @GetMapping("/{vehicleId}")
    public ResponseEntity<Vehicle> find(
            @PathVariable("vehicleId") String vehicleId) {
        return vehicleService.find(vehicleId).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }



}