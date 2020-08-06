package com.amarendra.project.rentmanagement.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.amarendra.project.rentmanagement.ApiPaths.API_PATH;
import static com.amarendra.project.rentmanagement.ApiPaths.OPERATIONS_SERVICE;

@RestController
@RequestMapping(value = API_PATH + OPERATIONS_SERVICE)
public class OperationsController {
    // Contact Tenant - 1. Email, 2. Call
    // Contact Landlord - 1. Email, 2. Call
    // Upload Rental Agreement

}
