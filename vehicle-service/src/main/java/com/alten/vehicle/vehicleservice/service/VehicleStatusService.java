package com.alten.vehicle.vehicleservice.service;

import com.alten.vehicle.vehicleservice.model.VehicleStatus;
import com.alten.vehicle.vehicleservice.repository.VehicleStatusRepository;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehicleStatusService {

    @Autowired
    private VehicleStatusRepository vehicleStatusRepository;

    public List<VehicleStatus> findAll() {
        return vehicleStatusRepository.findAll();
    }


    public VehicleStatus addNewStatus(VehicleStatus vehicleStatus) {
        return vehicleStatusRepository.save(vehicleStatus);
    }


    public Optional<List<VehicleStatus>> findActiveVehicles() {
        Calendar minuteAgo = Calendar.getInstance();
        minuteAgo.add(Calendar.MINUTE, -1);
        List<VehicleStatus> connectedVehicles = vehicleStatusRepository
                .findByLastActiveDateBetween(minuteAgo.getTime(), new Date()).stream()
                .collect(Collectors.toList());
        return Optional.ofNullable(connectedVehicles);
    }

    public Optional<List<VehicleStatus>> getVehicleStatus(@PathVariable("regNumber") String regNumber) {
        if (StringUtils.isBlank(regNumber)) {
            throw new IllegalArgumentException("reg Number is missing");
        }

        return vehicleStatusRepository.findByRegNumber(regNumber);
    }


}