package io.tutorialspring.garageApp.repository;

import io.tutorialspring.garageApp.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface GarageRepository extends CrudRepository<Car, Long> {
}
