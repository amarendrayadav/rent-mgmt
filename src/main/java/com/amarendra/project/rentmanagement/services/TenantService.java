package com.amarendra.project.rentmanagement.services;

import com.amarendra.project.rentmanagement.dataaccess.converters.TenantConverter;
import com.amarendra.project.rentmanagement.dataaccess.entities.Tenant;
import com.amarendra.project.rentmanagement.dataaccess.repository.TenantRepository;
import com.amarendra.project.rentmanagement.dataaccess.requests.TenantRequestBody;
import com.amarendra.project.rentmanagement.dataaccess.responses.TenantResponseBody;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class TenantService {

    private final TenantRepository tenantRepository;

    public TenantResponseBody addNewTenant(TenantRequestBody tenantRequestBody) {
        final Tenant tenant = new Tenant();
        tenant.setId(UUID.randomUUID());
        TenantConverter.convert(tenant, tenantRequestBody);
        return TenantConverter.convert(tenantRepository.save(tenant));
    }

    public TenantResponseBody getTenantById(UUID id) {
        return TenantConverter.convert(getTenant(id));
    }

    public TenantResponseBody updateTenantData(TenantRequestBody tenantRequestBody) {
        final Tenant property = getTenant(tenantRequestBody.getId());
        TenantConverter.convert(property, tenantRequestBody);
        return TenantConverter.convert(tenantRepository.save(property));
    }


    private Tenant getTenant(final UUID id) {
        return tenantRepository.findById(id).orElseThrow(() -> new NullPointerException("Tenant By id " + id + " not found!"));
    }
}
