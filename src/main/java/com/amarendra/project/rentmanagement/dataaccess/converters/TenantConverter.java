package com.amarendra.project.rentmanagement.dataaccess.converters;

import com.amarendra.project.rentmanagement.dataaccess.entities.Tenant;
import com.amarendra.project.rentmanagement.dataaccess.requests.TenantRequestBody;
import com.amarendra.project.rentmanagement.dataaccess.responses.TenantResponseBody;

import java.util.Objects;

public class TenantConverter {

    public static void convert(Tenant tenant, TenantRequestBody requestBody) {
        if (Objects.nonNull(requestBody.getEmailId())) {
            tenant.setEmailId(requestBody.getEmailId());
        }
        if (Objects.nonNull(requestBody.getName())) {
            tenant.setName(requestBody.getName());
        }
        if (Objects.nonNull(requestBody.getPanNumber())) {
            tenant.setPanNumber(requestBody.getPanNumber());
        }
        if (Objects.nonNull(requestBody.getPhoneNumber())) {
            tenant.setPhoneNumber(requestBody.getPhoneNumber());
        }
        if (Objects.nonNull(requestBody.getRentedPropertyId())) {
            tenant.setRentedPropertyId(requestBody.getRentedPropertyId());
        }
    }

    public static TenantResponseBody convert(Tenant requestBody) {
        TenantResponseBody responseBody = new TenantResponseBody();
        if (Objects.nonNull(requestBody.getId())) {
            responseBody.setId(requestBody.getId());
        }
        if (Objects.nonNull(requestBody.getEmailId())) {
            responseBody.setEmailId(requestBody.getEmailId());
        }
        if (Objects.nonNull(requestBody.getName())) {
            responseBody.setName(requestBody.getName());
        }
        if (Objects.nonNull(requestBody.getPanNumber())) {
            responseBody.setPanNumber(requestBody.getPanNumber());
        }
        if (Objects.nonNull(requestBody.getPhoneNumber())) {
            responseBody.setPhoneNumber(requestBody.getPhoneNumber());
        }
        if (Objects.nonNull(requestBody.getRentedPropertyId())) {
            responseBody.setRentedPropertyId(requestBody.getRentedPropertyId());
        }

        return responseBody;
    }

}
