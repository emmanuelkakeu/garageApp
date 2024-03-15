package io.tutorialSpring.garageApp.controller;


import io.swagger.v3.oas.annotations.Operation;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.tutorialSpring.garageApp.model.Car;
import io.tutorialSpring.garageApp.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(description =  "Endpoint to garage service", name="Garage Rest service")
public class GarageContoller {
    @Autowired
    private GarageService garageService;

    @RequestMapping("/api/cars")
    public List<Car> getCars() {
        Car mycar = new Car(1, "Laguna",  "Renault",  2002, Car.Color.RED);
        return garageService.getCars(); }

    @Operation(summary = "Garage Rest service")
    @RequestMapping("/api/car/{id}")
    public Car getCar(@PathVariable long id) { return garageService.getCar(id);}

    @Operation(summary = "Garage Rest service")
    @RequestMapping(method = RequestMethod.DELETE, value = ("/api/cars"))
    public void deleteCar(@PathVariable long id){ garageService.deleteCar(id);}

    @Operation(summary = "Garage Rest service")
    @RequestMapping(method = RequestMethod.POST, value = ("/api/cars"))
    public void addCar(@RequestBody Car car){garageService.addCar(car); }

    @Operation(summary = "Garage Rest service")
    @RequestMapping(method = RequestMethod.PUT, value = "/api/car/{id}")

    public void updateCar(@RequestBody Car car , @PathVariable long id){
       garageService.updateCar(car, id);
    }
}
