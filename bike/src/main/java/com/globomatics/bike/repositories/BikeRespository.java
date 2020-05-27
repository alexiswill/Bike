package com.globomatics.bike.repositories;

import com.globomatics.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRespository extends JpaRepository<Bike, Long>{
}
