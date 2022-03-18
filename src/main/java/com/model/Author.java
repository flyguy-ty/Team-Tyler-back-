package com.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private Name name;
    @Column
    private String userName;
    @Column
    private String passWord;

    @OneToMany(mappedBy = "author")
    private List<Review> reviews;
}
