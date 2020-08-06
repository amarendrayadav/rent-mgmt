package com.amarendra.project.rentmanagement.controllers;

import com.amarendra.project.rentmanagement.dataaccess.requests.PropertyRequestBody;
import com.amarendra.project.rentmanagement.dataaccess.responses.PropertyResponseBody;
import com.amarendra.project.rentmanagement.services.PropertyService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

import static com.amarendra.project.rentmanagement.ApiPaths.*;
import static org.springframework.http.HttpStatus.OK;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(API_PATH + PROPERTY_SERVICE)
public class PropertyController {

    private final PropertyService propertyService;

    // Add Property for landlord
    @PostMapping(path = ADD_PATH)
    @ApiOperation("Add new property")
    public ResponseEntity<PropertyResponseBody> addNewProperty(@RequestBody final PropertyRequestBody propertyRequestBody) {
        log.debug("Request to add new property {} ", propertyRequestBody);
        return new ResponseEntity<>(propertyService.addNewProperty(propertyRequestBody), OK);
    }

    // get property by Id
    @GetMapping(path = FIND_PATH + ID_PATH)
    @ApiOperation("Find property by Id")
    public ResponseEntity<PropertyResponseBody> getPropertyById(@PathVariable(ID) final UUID id) {
        log.debug("Request to get property by Id {} ", id);
        return new ResponseEntity<>(propertyService.getPropertyById(id), OK);
    }

    // get all properties by landlordId
    @GetMapping(path = FIND_ALL_PATH + LANDLORD_ID_PATH)
    @ApiOperation("Find property by landlordId")
    public ResponseEntity<List<PropertyResponseBody>> getPropertyByLandlordId(@PathVariable(LANDLORD_ID) final UUID id) {
        log.debug("Request to get property by landlordId {} ", id);
        return new ResponseEntity<>(propertyService.findAllPropertiesForLandlord(id), OK);
    }

    // Update Property
    @PutMapping(path = UPDATE_PATH)
    @ApiOperation("Update property")
    public ResponseEntity<PropertyResponseBody> updatePropertyData(@RequestBody final PropertyRequestBody requestBody) {
        log.debug("Request to Update property Data {} ", requestBody);
        return new ResponseEntity<>(propertyService.updatePropertyData(requestBody), OK);
    }

    // Remove Property for landlord
    // Get Rent History - stage 1 - only last 12 months, stage 2 - date range
    // get all property by landlord
    // alotment property to tenant
}
