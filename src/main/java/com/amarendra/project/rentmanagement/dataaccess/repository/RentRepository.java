package com.amarendra.project.rentmanagement.dataaccess.repository;

import com.amarendra.project.rentmanagement.dataaccess.entities.Rent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RentRepository extends MongoRepository<Rent, UUID> {
}
