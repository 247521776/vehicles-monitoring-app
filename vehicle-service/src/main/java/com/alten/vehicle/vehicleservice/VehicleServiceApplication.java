package com.alten.vehicle.vehicleservice;


import com.alten.vehicle.vehicleservice.model.VehicleStatus;
import com.alten.vehicle.vehicleservice.repository.VehicleStatusRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VehicleServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(VehicleServiceApplication.class, args);
    }




 /*   @Bean
    public CommandLineRunner demo(VehicleStatusRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new VehicleStatus("ABC123",0));
            repository.save(new VehicleStatus("DEF456",0));
            repository.save(new VehicleStatus("GHI789",0));
            repository.save(new VehicleStatus("JKL012",0));
            repository.save(new VehicleStatus("MNO345",0));
            repository.save(new VehicleStatus("PQR678",0));
            repository.save(new VehicleStatus("STU901",0));




        };
    }*/

}
