package com.amarendra.project.rentmanagement.dataaccess.repository;

import com.amarendra.project.rentmanagement.dataaccess.entities.Landlord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LandlordRepository extends MongoRepository<Landlord, UUID> {
}
