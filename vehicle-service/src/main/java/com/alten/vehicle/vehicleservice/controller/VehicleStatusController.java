package com.alten.vehicle.vehicleservice.controller;


import com.alten.vehicle.vehicleservice.model.Status;
import com.alten.vehicle.vehicleservice.model.VehicleStatus;
import com.alten.vehicle.vehicleservice.service.VehicleStatusService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.ForeignKey;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehicle/status")
public class VehicleStatusController {
    @Autowired
    private VehicleStatusService vehicleStatusService;


    @GetMapping
    public ResponseEntity<List<VehicleStatus>> findAll() {
        List<VehicleStatus> vehicleStatuses = vehicleStatusService.findAll();
        if (vehicleStatuses.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(vehicleStatuses);
    }

    @GetMapping("/{regNumber}")
    public ResponseEntity<Optional<List<VehicleStatus>>> getVehicleStatus(@PathVariable("regNumber") String regNumber) {
        if (StringUtils.isBlank(regNumber)) {
            throw new IllegalArgumentException("reg Number is missing");
        }

        return ResponseEntity.ok(vehicleStatusService.getVehicleStatus(regNumber));

    }


    @PostMapping
    public ResponseEntity<String> updateVehicleStaus(@RequestParam("vehicleId") String vehicleId, @RequestParam("status") String status) {
        vehicleStatusService.addNewStatus(new VehicleStatus(vehicleId,Integer.valueOf(status)));
        return ResponseEntity.accepted().build();
    }


    @RequestMapping(path = "/activeVehicles", method = RequestMethod.GET)
    public ResponseEntity<List<VehicleStatus>> getConnectedVehicles(){
        return vehicleStatusService.findActiveVehicles()
                .map(v -> ResponseEntity.ok(v))
                .orElse(ResponseEntity.notFound().build());
    }


}