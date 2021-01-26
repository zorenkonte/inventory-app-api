package com.darkmode.inventory_app.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class BaseEntity {
    private static final long serialVersionUID = 42L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
}
