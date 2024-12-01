package com.dilux.OnlineFoodOrder.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.List;

@Data
@Embeddable
public class RestaurentDTO  {

    private String title;

    @Column(length = 1000)
    private List<String> image;

    private String description;

}