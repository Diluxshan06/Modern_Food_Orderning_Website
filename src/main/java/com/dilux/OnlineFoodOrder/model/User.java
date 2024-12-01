package com.dilux.OnlineFoodOrder.model;


import com.dilux.OnlineFoodOrder.dto.RestaurentDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;

    private String email;

    private String password;

    private UserRole role;

    @JsonIgnore
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "customer")
    private List<Order> order=new ArrayList<>();

    @ElementCollection
    @OneToMany
    private List<RestaurentDTO> favorite = new ArrayList<>();

    @OneToMany(cascade=CascadeType.ALL,orphanRemoval = true)
    private List<Address> addresses  =new ArrayList<>();
}
