package com.darkmode.inventory_app.model;

import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Dimension extends BaseEntity {
    private float length;
    private float width;
    private float height;
    private float diameter;
}
