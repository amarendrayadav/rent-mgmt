package com.amarendra.project.rentmanagement.dataaccess.converters;

import com.amarendra.project.rentmanagement.dataaccess.entities.Rent;
import com.amarendra.project.rentmanagement.dataaccess.requests.RentRequestBody;
import com.amarendra.project.rentmanagement.dataaccess.responses.RentResponseBody;

import java.util.Date;
import java.util.Objects;

public class RentConverter {

    public static void convert(Rent rent, RentRequestBody rentRequestBody) {
        if (Objects.nonNull(rentRequestBody.getAmount())) {
            rent.setAmount(rentRequestBody.getAmount());
        }
        if (Objects.nonNull(rentRequestBody.getCurrency())) {
            rent.setCurrency(rentRequestBody.getCurrency());
        } else
            rent.setCurrency("INR"); //todo :

        if (Objects.nonNull(rentRequestBody.getForMonth())) {
            rent.setForMonth(rentRequestBody.getForMonth());
        }
        if (Objects.nonNull(rentRequestBody.getForYear())) {
            rent.setForYear(rentRequestBody.getForYear());
        }
        if (Objects.nonNull(rentRequestBody.getPaidOn())) {
            rent.setPaidOn(rentRequestBody.getPaidOn());
        } else
            rent.setPaidOn(new Date());

        if (Objects.nonNull(rentRequestBody.getTenantId())) {
            rent.setTenantId(rentRequestBody.getTenantId());
        }
        if (Objects.nonNull(rentRequestBody.getPropertyId())) {
            rent.setPropertyId(rentRequestBody.getPropertyId());
        }
    }

    public static RentResponseBody convert(Rent rent) {
        RentResponseBody rentResponseBody = new RentResponseBody();
        if (Objects.nonNull(rent.getId())) {
            rentResponseBody.setId(rent.getId());
        }
        if (Objects.nonNull(rent.getAmount())) {
            rentResponseBody.setAmount(rent.getAmount());
        }
        if (Objects.nonNull(rent.getCurrency())) {
            rentResponseBody.setCurrency(rent.getCurrency());
        } else
            rentResponseBody.setCurrency("INR"); //todo :

        if (Objects.nonNull(rent.getForMonth())) {
            rentResponseBody.setForMonth(rent.getForMonth());
        }
        if (Objects.nonNull(rent.getForYear())) {
            rentResponseBody.setForYear(rent.getForYear());
        }
        if (Objects.nonNull(rent.getPaidOn())) {
            rentResponseBody.setPaidOn(rent.getPaidOn());
        } else
            rentResponseBody.setPaidOn(new Date());

        if (Objects.nonNull(rent.getTenantId())) {
            rentResponseBody.setTenantId(rent.getTenantId());
        }
        if (Objects.nonNull(rent.getPropertyId())) {
            rentResponseBody.setPropertyId(rent.getPropertyId());
        }
        return rentResponseBody;
    }

}
