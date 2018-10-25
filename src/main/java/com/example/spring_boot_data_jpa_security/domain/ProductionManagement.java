package com.example.spring_boot_data_jpa_security.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.security.core.userdetails.User;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
class ProductionManagement extends AbstractPersistable<Integer> {

    @ManyToOne
    @JoinColumn(name = "managerId")
    private User manager;

    @ManyToOne
    @JoinColumn(name = "productionManagerId")
    private User productionManager;

    @ManyToOne
    @JoinColumn(name = "productionId")
    private Production production;

}
