package com.alten.vehicle.vehicleservice.model;

public enum Status {

    CONNECTED(1), DISCONNECTED(0);

    private int vehicleStatus;

    Status(int vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }


    public int getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(int vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
}
