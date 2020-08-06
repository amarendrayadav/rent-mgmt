package com.amarendra.project.rentmanagement.dataaccess.repository;

import com.amarendra.project.rentmanagement.dataaccess.entities.Property;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PropertyRepository extends MongoRepository<Property, UUID> {
    List<Property> findAllByLandlordId(UUID landlordId);
}
