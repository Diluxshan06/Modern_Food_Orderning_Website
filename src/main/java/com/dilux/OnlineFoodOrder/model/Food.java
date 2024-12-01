package com.dilux.OnlineFoodOrder.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    private Long price;

    @ManyToOne
    private Category category;

    @Column(length = 1000)
    @ElementCollection
    private List<String> image;

    private boolean available;

    @ManyToOne
    private Restaurent restaurent;

    private boolean isVegetarian;

    private boolean isSeasonal;

    @ManyToOne
    private List<IngredientItem> ingredientItems=new ArrayList<>();

    private Date creationDate;

}
