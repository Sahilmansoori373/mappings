package com.example.mapping.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double price;
    private String createdBy;
    private String updatedBy;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
//    @JsonBackReference
    private Category category;

}
