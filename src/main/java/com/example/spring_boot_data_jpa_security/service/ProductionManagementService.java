package com.example.spring_boot_data_jpa_security.service;


import com.example.spring_boot_data_jpa_security.domain.Production;
import com.example.spring_boot_data_jpa_security.domain.ProductionManagement;

public interface ProductionManagementService {

    ProductionManagement update(Production production);

    ProductionManagement findByProduction(Production production);

}
