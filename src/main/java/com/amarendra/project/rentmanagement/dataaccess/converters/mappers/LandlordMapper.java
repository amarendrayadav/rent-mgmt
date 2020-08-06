package com.amarendra.project.rentmanagement.dataaccess.converters.mappers;

import com.amarendra.project.rentmanagement.dataaccess.entities.Landlord;
import com.amarendra.project.rentmanagement.dataaccess.requests.LandlordRequestBody;
import com.amarendra.project.rentmanagement.dataaccess.responses.LandlordResponseBody;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public abstract class LandlordMapper {

//    public static final LandlordMapper LANDLORD_MAPPER = Mappers.getMapper(LandlordMapper.class);

    @Mappings({
            @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())")
    })
    public abstract Landlord map(LandlordRequestBody requestBody);

    public abstract LandlordResponseBody map(Landlord landlord);
}
