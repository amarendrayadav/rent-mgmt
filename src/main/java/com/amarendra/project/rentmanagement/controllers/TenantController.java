package com.amarendra.project.rentmanagement.controllers;

import com.amarendra.project.rentmanagement.dataaccess.requests.TenantRequestBody;
import com.amarendra.project.rentmanagement.dataaccess.responses.TenantResponseBody;
import com.amarendra.project.rentmanagement.services.TenantService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static com.amarendra.project.rentmanagement.ApiPaths.*;
import static org.springframework.http.HttpStatus.OK;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(API_PATH + TENANT_SERVICE)
public class TenantController {

    private final TenantService tenantService;

    // Add New Tenant
    @PostMapping(path = ADD_PATH)
    @ApiOperation("Add new Tenant")
    public ResponseEntity<TenantResponseBody> addNewTenant(@RequestBody final TenantRequestBody tenantRequestBody) {
        log.debug("Request to add new tenant {} ", tenantRequestBody);
        return new ResponseEntity<>(tenantService.addNewTenant(tenantRequestBody), OK);
    }

    // get Tenant by Id
    @GetMapping(path = FIND_PATH + ID_PATH)
    @ApiOperation("Find Tenant by Id")
    public ResponseEntity<TenantResponseBody> getTenantById(@PathVariable(ID) final UUID id) {
        log.debug("Request to get tenant by Id {} ", id);
        return new ResponseEntity<>(tenantService.getTenantById(id), OK);
    }

    // Update Tenant
    @PutMapping(path = UPDATE_PATH)
    @ApiOperation("Update Tenant")
    public ResponseEntity<TenantResponseBody> updateTenantData(@RequestBody final TenantRequestBody requestBody) {
        log.debug("Request to Update tenant Data {} ", requestBody);
        return new ResponseEntity<>(tenantService.updateTenantData(requestBody), OK);
    }

}
