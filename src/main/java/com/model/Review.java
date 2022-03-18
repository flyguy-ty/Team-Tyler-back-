package com.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private double rating;

    @Column(length = 5000)
    private String comment;

    @ManyToOne
    private Author author;

    @ManyToOne
    private Movie movie;

}
