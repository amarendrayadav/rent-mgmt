package com.amarendra.project.rentmanagement.controllers;

import com.amarendra.project.rentmanagement.dataaccess.requests.RentRequestBody;
import com.amarendra.project.rentmanagement.dataaccess.responses.RentResponseBody;
import com.amarendra.project.rentmanagement.services.RentService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.amarendra.project.rentmanagement.ApiPaths.*;
import static org.springframework.http.HttpStatus.OK;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = API_PATH + RENT_SERVICE)
public class RentController {
    private final RentService rentService;

    @PostMapping(path = ADD_PATH)
    @ApiOperation("Request to pay rent by tenant")
    public ResponseEntity<RentResponseBody> createRent(@RequestBody final RentRequestBody rentRequestBody) {
        log.info("Request to pay rent {} ", rentRequestBody);
        return new ResponseEntity<>(rentService.createRent(rentRequestBody), OK);
    }

    // show rent history for tenant;

    // show rent history for property;

    // update rent - this must have validation


}
