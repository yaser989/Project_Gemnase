package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.modul.Sportifs;

public interface SportifsRepository extends MongoRepository<Sportifs, Long>{

}
