package com.dilux.OnlineFoodOrder.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    private IngredientCategroy ingredientCategroy;

    @ManyToOne
    private IngredientCategroy categroy;

    @JsonIgnore
    @ManyToOne
    private Restaurent restaurent;

    private boolean inStock=true;
}
