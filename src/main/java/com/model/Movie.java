package com.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
public class Movie {
    @Id
    private int id;

    @OneToMany(mappedBy = "movie")
    private List<Review> reviews;
}
