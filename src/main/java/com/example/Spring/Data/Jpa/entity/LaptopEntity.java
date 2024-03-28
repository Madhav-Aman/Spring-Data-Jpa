package com.example.Spring.Data.Jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="laptop")
public class LaptopEntity {

    @Id
    private Integer lapID;

    @Column
    private String model;

    public Integer getLapID() {
        return lapID;
    }

    public void setLapID(Integer lapID) {
        this.lapID = lapID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LaptopEntity(Integer lapID, String model) {
        this.lapID = lapID;
        this.model = model;
    }

    @Override
    public String toString() {
        return "LaptopEntity{" +
                "lapID=" + lapID +
                ", model='" + model + '\'' +
                '}';
    }

    public LaptopEntity() {
    }
}
