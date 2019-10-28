package com.example.demo.repo;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.modul.Gymnases;

public interface GymnasesRepository extends MongoRepository<Gymnases, String>{
	
	

}
