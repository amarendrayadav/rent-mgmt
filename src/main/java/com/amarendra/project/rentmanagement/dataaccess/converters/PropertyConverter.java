package com.amarendra.project.rentmanagement.dataaccess.converters;

import com.amarendra.project.rentmanagement.dataaccess.entities.Property;
import com.amarendra.project.rentmanagement.dataaccess.requests.PropertyRequestBody;
import com.amarendra.project.rentmanagement.dataaccess.responses.PropertyResponseBody;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PropertyConverter {

    public static void convert(final Property property, final PropertyRequestBody propertyRequestBody) {
        if (Objects.nonNull(propertyRequestBody.getName())) {
            property.setName(propertyRequestBody.getName());
        }
        if (Objects.nonNull(propertyRequestBody.getAddress())) {
            property.setAddress(propertyRequestBody.getAddress());
        }
        if (Objects.nonNull(propertyRequestBody.getLandlordId())) {
            property.setLandlordId(propertyRequestBody.getLandlordId());
        }
        if (Objects.nonNull(propertyRequestBody.getTenantId())) {
            property.setTenantId(propertyRequestBody.getTenantId());
        }
        if (Objects.nonNull(propertyRequestBody.getAgreementId())) {
            property.setAgreementId(propertyRequestBody.getAgreementId());
        }
        if (Objects.nonNull(propertyRequestBody.getRentPerMonth())) {
            property.setRentPerMonth(propertyRequestBody.getRentPerMonth());
        }
        if (Objects.nonNull(propertyRequestBody.getIsRented())) {
            property.setIsRented(propertyRequestBody.getIsRented());
        }

    }

    public static PropertyResponseBody convert(Property property) {
        PropertyResponseBody propertyResponseBody = new PropertyResponseBody();
        if (Objects.nonNull(property.getId())) {
            propertyResponseBody.setName(property.getName());
        }
        if (Objects.nonNull(property.getName())) {
            propertyResponseBody.setName(property.getName());
        }
        if (Objects.nonNull(property.getAddress())) {
            propertyResponseBody.setAddress(property.getAddress());
        }
        if (Objects.nonNull(property.getLandlordId())) {
            propertyResponseBody.setLandlordId(property.getLandlordId());
        }
        if (Objects.nonNull(property.getTenantId())) {
            propertyResponseBody.setTenantId(property.getTenantId());
        }
        if (Objects.nonNull(property.getAgreementId())) {
            propertyResponseBody.setAgreementId(property.getAgreementId());
        }
        if (Objects.nonNull(property.getRentPerMonth())) {
            propertyResponseBody.setRentPerMonth(property.getRentPerMonth());
        }
        if (Objects.nonNull(property.getIsRented())) {
            propertyResponseBody.setIsRented(property.getIsRented());
        }

        return propertyResponseBody;
    }

    public static List<PropertyResponseBody> convert(List<Property> landlordProperties) {
        return landlordProperties.stream().map(PropertyConverter::convert).collect(Collectors.toList());
    }
}
