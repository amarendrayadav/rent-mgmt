package com.amarendra.project.rentmanagement.services;

import com.amarendra.project.rentmanagement.dataaccess.converters.PropertyConverter;
import com.amarendra.project.rentmanagement.dataaccess.entities.Property;
import com.amarendra.project.rentmanagement.dataaccess.repository.PropertyRepository;
import com.amarendra.project.rentmanagement.dataaccess.requests.PropertyRequestBody;
import com.amarendra.project.rentmanagement.dataaccess.responses.PropertyResponseBody;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PropertyService {
    private final PropertyRepository propertyRepository;

    public PropertyResponseBody addNewProperty(final PropertyRequestBody propertyRequestBody) {
        final Property property = new Property();
        property.setId(UUID.randomUUID());
        PropertyConverter.convert(property, propertyRequestBody);
        return PropertyConverter.convert(propertyRepository.save(property));
    }

    public PropertyResponseBody getPropertyById(final UUID id) {
        return PropertyConverter.convert(getProperty(id));
    }

    public PropertyResponseBody updatePropertyData(final PropertyRequestBody propertyRequestBody) {
        final Property property = getProperty(propertyRequestBody.getId());
        PropertyConverter.convert(property, propertyRequestBody);
        return PropertyConverter.convert(propertyRepository.save(property));
    }

    public List<PropertyResponseBody> findAllPropertiesForLandlord(final UUID landlordId) {
        List<Property> landlordProperties = propertyRepository.findAllByLandlordId(landlordId);
        return PropertyConverter.convert(landlordProperties);
    }

    private Property getProperty(final UUID id) {
        return propertyRepository.findById(id).orElseThrow(() -> new NullPointerException("Property By id " + id + " not found!"));
    }
}
