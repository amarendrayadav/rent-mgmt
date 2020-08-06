package com.amarendra.project.rentmanagement.dataaccess.entities;

import com.amarendra.project.rentmanagement.dataaccess.entities.model.Address;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.UUID;

@Data
@Document("properties")
public class Property extends AbstractEntity {
    private Address address;
    private BigInteger rentPerMonth;
    private UUID landlordId;
    private Boolean isRented;
    private UUID tenantId;
    private UUID agreementId; // file will be stored somewhere
}
