package com.amarendra.project.rentmanagement.dataaccess.entities.model;

import lombok.Data;

@Data
public class Address {
    private String houseNumber;
    private String floor;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zipCode;
}
