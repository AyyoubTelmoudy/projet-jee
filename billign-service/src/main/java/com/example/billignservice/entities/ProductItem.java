package com.example.billignservice.entities;

import com.example.billignservice.model.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductItem {
    @Id
    private Long id;
    private double quantity;
    private double price;
    private long productID;
    @Transient
    private String productName;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private Bill bill;
    @Transient
    private Product product;

    public double getAmount()
    {
        double some=0;
        return quantity*price;
    }

}
