package com.darkmode.inventory_app.model;

import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class UnitOfMeasure extends BaseEntity {
    private String value;
    //TODO Convert symbol to Enum type with enum converter (optional)
    private String symbol;
}
