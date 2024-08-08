package com.bit.carshowroom.service;
import java.util.ArrayList;
import java.util.List;
import com.bit.carshowroom.model.Car;
import com.bit.carshowroom.repository.ShowroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarService {

    @Autowired  /* as we are connecting with database we need to delete the list and replace it with the below code */
    ShowroomRepository repository;

    public  String addCar(List<Car> car)
    {
        repository.saveAll(car);
//        repository.save(Car.builder().id(1).build());
        return "success";
    }
    public List<Car> getAllCars()
    {
        return repository.findAll();
    }

    public String sellCar(long id) {
        repository.deleteById(id);
        return "Selled";
    }
}
