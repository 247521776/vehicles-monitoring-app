package com.alten.vehicle.vehicleservice.model;


import javax.persistence.*;
import java.util.Date;

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

    @Column(name = "LAST_ACTIVE_DATE", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastActiveDate;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getLastActiveDate() {
        return lastActiveDate;
    }

    public void setLastActiveDate(Date lastActiveDate) {
        this.lastActiveDate = lastActiveDate;
    }

    public VehicleStatus(String regNumber, int status) {
        this.regNumber = regNumber;
        this.status = status;
        this.lastActiveDate = new Date();
    }

    public VehicleStatus() {
        this.lastActiveDate = new Date();
    }
}
