package com.example.spring_boot_data_jpa_security.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.security.core.userdetails.User;

@Entity
public class Production extends AbstractPersistable<Integer> {

    private String name;

    @ManyToOne
    @JoinColumn(name = "managerId")
    private User manager;

    @ManyToOne
    @JoinColumn(name = "productionManagerId")
    private User productionManager;
}
