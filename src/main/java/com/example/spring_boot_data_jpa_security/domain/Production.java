package com.example.spring_boot_data_jpa_security.domain;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Production extends AbstractPersistable<Integer> {

    private String name;

//    @ManyToOne
//    @JoinColumn(name = "productionManagementId")
//    private ProductionManagement productionManagement;

}