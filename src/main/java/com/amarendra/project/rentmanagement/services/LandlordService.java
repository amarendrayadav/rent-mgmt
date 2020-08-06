package com.amarendra.project.rentmanagement.services;

import com.amarendra.project.rentmanagement.dataaccess.converters.LandlordConverter;
import com.amarendra.project.rentmanagement.dataaccess.entities.Landlord;
import com.amarendra.project.rentmanagement.dataaccess.repository.LandlordRepository;
import com.amarendra.project.rentmanagement.dataaccess.requests.LandlordRequestBody;
import com.amarendra.project.rentmanagement.dataaccess.responses.LandlordResponseBody;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LandlordService {
    private final LandlordRepository landlordRepository;

    public LandlordResponseBody addNewLandlord(final LandlordRequestBody landlordRequestBody) {
        final Landlord landlord = new Landlord();
        landlord.setId(UUID.randomUUID());
        LandlordConverter.convert(landlord, landlordRequestBody);
        return LandlordConverter.convert(landlordRepository.save(landlord));
    }

    public LandlordResponseBody getLandlordById(final UUID id) {
        return LandlordConverter.convert(getLandlord(id));
    }

    public LandlordResponseBody updateLandlordData(final LandlordRequestBody landlordRequestBody) {
        final Landlord landlord = getLandlord(landlordRequestBody.getId());
        LandlordConverter.convert(landlord, landlordRequestBody);
        return LandlordConverter.convert(landlordRepository.save(landlord));
    }

    private Landlord getLandlord(final UUID id) {
        return landlordRepository.findById(id).orElseThrow(() -> new NullPointerException("Landlord By id " + id + " Not found!"));
    }

    public List<LandlordResponseBody> getAllLandlords() {
        return LandlordConverter.convert(landlordRepository.findAll());
    }
}
