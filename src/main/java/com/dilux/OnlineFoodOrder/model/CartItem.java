package com.dilux.OnlineFoodOrder.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int total;

    @JsonIgnore
    @ManyToOne
    private Cart cart;

    @ManyToOne
    private Food foods;

    private int quantity;

    private List<String> ingredients;

    private Long totalPrice;


}
