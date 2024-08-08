package com.bit.carshowroom.controller;

import com.bit.carshowroom.model.Car;
import com.bit.carshowroom.service.CarService;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // This annotation indicates that this class serves the role of a controller in a Spring MVC application
public class CarController {

    @Autowired
    CarService service; // Object created

    @GetMapping(value = "/allcars") // This method handles GET requests to the URL "/allcars"
    // It returns a list of Car objects
    public List<Car> getAllCar() {
        return service.getAllCars();
    }

    @PostMapping(value = "/addcar") // This method handles POST requests to the URL "/addcar"
    // It takes a list of Car objects as input and returns a success message
    public String addCar(@RequestBody List<Car> cars) { // (RequestBody) Indicates that the parameter should be bound to the body of the HTTP request
        return service.addCar(cars);
    }

    @PostMapping(value = "/sellcar") // This method handles POST requests to the URL "/sellcar"
    public String sellCar(@RequestBody long id) {
        return service.sellCar(id);
    }
}
