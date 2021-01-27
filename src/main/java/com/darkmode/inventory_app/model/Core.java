package com.darkmode.inventory_app.model;

import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Core extends BaseEntity {
    private float thickness;
    private float diameter;
    private float length;
    private float weight;
}
