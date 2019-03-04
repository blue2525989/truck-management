package com.bierbrauer.truckmanagement.model.warehouse;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
//@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Warehouse implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;

    public Warehouse(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
