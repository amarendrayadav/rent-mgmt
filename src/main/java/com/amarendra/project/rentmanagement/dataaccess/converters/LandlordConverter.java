package com.amarendra.project.rentmanagement.dataaccess.converters;

import com.amarendra.project.rentmanagement.dataaccess.entities.Landlord;
import com.amarendra.project.rentmanagement.dataaccess.requests.LandlordRequestBody;
import com.amarendra.project.rentmanagement.dataaccess.responses.LandlordResponseBody;

import java.util.*;
import java.util.stream.Collectors;

public class LandlordConverter {
//    private static LandlordMapper mapper = LandlordMapper.LANDLORD_MAPPER;

    public static LandlordResponseBody convert(final Landlord landlord) {
        LandlordResponseBody responseBody = new LandlordResponseBody();
        responseBody.setId(landlord.getId());
        if (Objects.nonNull(landlord.getEmailId())) {
            responseBody.setEmailId(landlord.getEmailId());
        }
        if (Objects.nonNull(landlord.getPanNumber())) {
            responseBody.setPanNumber(landlord.getPanNumber());
        }
        if (Objects.nonNull(landlord.getPhoneNumber())) {
            responseBody.setPhoneNumber(landlord.getPhoneNumber());
        }
        if (Objects.nonNull(landlord.getName())) {
            responseBody.setName(landlord.getName());
        }
        if (Objects.nonNull(landlord.getProperties())) {
            Set<UUID> properties = new HashSet<>(landlord.getProperties());
            responseBody.setProperties(properties);
        }

        return responseBody;
    }

    public static void convert(final Landlord landlord, final LandlordRequestBody requestBody) {
        if (Objects.nonNull(requestBody.getEmailId())) {
            landlord.setEmailId(requestBody.getEmailId());
        }
        if (Objects.nonNull(requestBody.getPanNumber())) {
            landlord.setPanNumber(requestBody.getPanNumber());
        }
        if (Objects.nonNull(requestBody.getPhoneNumber())) {
            landlord.setPhoneNumber(requestBody.getPhoneNumber());
        }
        if (Objects.nonNull(requestBody.getName())) {
            landlord.setName(requestBody.getName());
        }
        if (Objects.nonNull(requestBody.getProperties())) {
            Set<UUID> properties = new HashSet<>(requestBody.getProperties());
            landlord.setProperties(properties);
        }
    }

    public static List<LandlordResponseBody> convert(List<Landlord> landlordList) {
        return landlordList.stream().map(LandlordConverter::convert).collect(Collectors.toList());
    }
}
