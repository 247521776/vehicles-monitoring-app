package com.alten.vehicle.vehicleservice.repository;

import com.alten.vehicle.vehicleservice.model.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Long> {

    Optional<List<VehicleStatus>> findByRegNumber(String regNumber);

    List<VehicleStatus> findByLastActiveDateBetween(Date minuteAgo, Date now);

}