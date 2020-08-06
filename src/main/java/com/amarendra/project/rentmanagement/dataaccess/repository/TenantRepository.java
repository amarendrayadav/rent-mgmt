package com.amarendra.project.rentmanagement.dataaccess.repository;

import com.amarendra.project.rentmanagement.dataaccess.entities.Tenant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TenantRepository extends MongoRepository<Tenant, UUID> {
}
