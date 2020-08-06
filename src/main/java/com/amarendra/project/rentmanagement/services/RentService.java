package com.amarendra.project.rentmanagement.services;

import com.amarendra.project.rentmanagement.dataaccess.converters.RentConverter;
import com.amarendra.project.rentmanagement.dataaccess.entities.Rent;
import com.amarendra.project.rentmanagement.dataaccess.repository.RentRepository;
import com.amarendra.project.rentmanagement.dataaccess.requests.RentRequestBody;
import com.amarendra.project.rentmanagement.dataaccess.responses.RentResponseBody;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RentService {
    private final RentRepository rentRepository;

    // create rent i.e rent paid by tenant for property- so record must store paidById and paidForId;
    public RentResponseBody createRent(final RentRequestBody rentRequestBody) {
        final Rent rent = new Rent();
        rent.setId(UUID.randomUUID());
        RentConverter.convert(rent, rentRequestBody);
        return RentConverter.convert(rentRepository.save(rent));
    }
    // find rent paid history by tenantId - response must contain rent paid for previous 12 months, amount, propertyId


    // find rent history for propertyId - response must contain rent paid for previous 12 months, amount and tenantId


}
