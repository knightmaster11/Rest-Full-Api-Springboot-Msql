package com.example.demo.Entity;

import java.io.Serializable;
import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "tbl_product")
public class Account implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "Name is required")
    @Column(name="product_name", length = 115)
    private String name;

    @NotEmpty(message = "Description is required")
    private String description;

    private Double price;

    @ManyToOne
    private Category category;

    @ManyToAny
    @JoinTable(name = "tbl_product_supplier",
    joinColumns = @JoinColumn(name = "product_id"),
    inverseJoinColumns = @JoinColumn(name = "supplier_id"))
    private Set<Supplier> suppliers;
    // public Account() {
    // }

    // public Account(long id, String name, String description, Double price) {
    //     this.id = id;
    //     this.name = name;
    //     this.description = description;
    //     this.price = price;
    // }

    // public long getId() {
    //     return id;
    // }

    // public void setId(long id) {
    //     this.id = id;
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public String getDescription() {
    //     return description;
    // }

    // public void setDescription(String description) {
    //     this.description = description;
    // }

    // public Double getPrice() {
    //     return price;
    // }

    // public void setPrice(Double price) {
    //     this.price = price;
    // }

    
}