package com.segways.segways.repositry;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.segways.segways.Model.Ride;

public interface RideRepository  extends MongoRepository<Ride, String>{ 
	List<Ride> findByStatus(String status);

}