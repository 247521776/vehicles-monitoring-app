package com.alten.vehicle.vehicleservice.model;


import javax.persistence.*;

@Entity(name = "VEHICLE_STATUS")
public class VehicleStatus {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "REG_NUMBER")
    private String regNumber;

    @Column(name = "STATUS")
    private int status;

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
