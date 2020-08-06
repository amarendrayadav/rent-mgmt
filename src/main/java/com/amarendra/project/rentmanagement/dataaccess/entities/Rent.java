package com.amarendra.project.rentmanagement.dataaccess.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;
import java.time.Month;
import java.time.Year;
import java.util.Date;
import java.util.UUID;

@Data
public class Rent {
    @Id
    private UUID id;
    private Year forYear;
    private Month forMonth;
    private BigInteger amount;
    private String currency; // by default it is INR
    private Date paidOn;
    private UUID tenantId; // paid by
    private UUID propertyId; // paid for
}
