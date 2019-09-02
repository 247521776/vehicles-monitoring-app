package com.alten.vehicle.vehicleservice.repository;

import com.alten.vehicle.vehicleservice.model.Vehicle;
import com.alten.vehicle.vehicleservice.model.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Long> {


}