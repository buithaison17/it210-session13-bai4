package org.example.bai4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.time.LocalDate;

@Entity
@Table(name = "medicines")
public class Medicine {
    @Id
    private Long id;
    private String name;
    private String unit;
    private LocalDate expiryDate;

    public Medicine() {
    }

    public Medicine(Long id, String name, String unit, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.expiryDate = expiryDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
