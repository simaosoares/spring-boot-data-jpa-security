package com.example.spring_boot_data_jpa_security.service;

import com.example.spring_boot_data_jpa_security.domain.Production;
import com.example.spring_boot_data_jpa_security.domain.ProductionManagement;
import org.springframework.security.access.prepost.PreAuthorize;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ProductionManagementServiceImpl implements ProductionManagementService {

    @Override
    @PreAuthorize("hasPermission('UPDATE_PRODUCTION_MANAGEMENT')")
    public ProductionManagement update(Production production) {
        throw new NotImplementedException();
    }

    @Override
    @PreAuthorize("hasRole('ROLE_USER')")
    public ProductionManagement findByProduction(Production production) {
        throw new NotImplementedException();
    }
}
