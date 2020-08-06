package com.amarendra.project.rentmanagement.controllers;

import com.amarendra.project.rentmanagement.dataaccess.requests.LandlordRequestBody;
import com.amarendra.project.rentmanagement.dataaccess.responses.LandlordResponseBody;
import com.amarendra.project.rentmanagement.services.LandlordService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

import static com.amarendra.project.rentmanagement.ApiPaths.*;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
@RequestMapping(API_PATH + LANDLORD_SERVICE)
@Slf4j
public class LandlordController {
    private final LandlordService landlordService;

    @PostMapping(path = ADD_PATH)
    @ApiOperation("Add new landlord")
    public ResponseEntity<LandlordResponseBody> addNewLandlord(@RequestBody final LandlordRequestBody landlordRequestBody) {
        log.debug("Request to add new Landlord {} ", landlordRequestBody);
        return new ResponseEntity<>(landlordService.addNewLandlord(landlordRequestBody), OK);
    }

    @GetMapping(path = FIND_ALL_PATH)
    @ApiOperation("Find all landlords")
    public ResponseEntity<List<LandlordResponseBody>> getAllLandlord() {
        log.debug("Request to get all Landlords {} ");
        return new ResponseEntity<>(landlordService.getAllLandlords(), OK);
    }

    @GetMapping(path = FIND_PATH + ID_PATH)
    @ApiOperation("Find landlord by Id")
    public ResponseEntity<LandlordResponseBody> getLandlordById(@PathVariable(ID) final UUID id) {
        log.debug("Request to get Landlord by Id {} ", id);
        return new ResponseEntity<>(landlordService.getLandlordById(id), OK);
    }

    @PutMapping(path = UPDATE_PATH)
    @ApiOperation("Update landlord")
    public ResponseEntity<LandlordResponseBody> updateLandlordData(@RequestBody final LandlordRequestBody requestBody) {
        log.debug("Request to Update landlord Data {} ", requestBody);
        return new ResponseEntity<>(landlordService.updateLandlordData(requestBody), OK);
    }
}
