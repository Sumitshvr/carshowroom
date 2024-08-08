package com.bit.carshowroom.repository;

import com.bit.carshowroom.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowroomRepository extends JpaRepository<Car, Long> {
}
