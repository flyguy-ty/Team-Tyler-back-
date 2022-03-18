package com.repository;

import com.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface AuthorRepository extends JpaRepository<Author,Integer> {

    // finding all customers
    @Query("from Author")
    List<Author> findAll();

    // save a customer
    Author save(Author author);






}
