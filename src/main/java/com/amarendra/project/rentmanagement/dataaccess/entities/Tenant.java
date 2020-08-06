package com.amarendra.project.rentmanagement.dataaccess.entities;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;
import java.util.UUID;

@Data
@Document("tenants")
public class Tenant extends AbstractEntity {
    private String phoneNumber;
    private String emailId;
    private String panNumber;
    private UUID rentedPropertyId;
    private Set<UUID> rentedProperties;
}
