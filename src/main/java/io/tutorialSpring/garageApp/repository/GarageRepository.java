package io.tutorialSpring.garageApp.repository;

import io.tutorialSpring.garageApp.model.Car;
import org.springframework.data.repository.CrudRepository;


public interface GarageRepository extends
        CrudRepository<Car, Long> {
}
