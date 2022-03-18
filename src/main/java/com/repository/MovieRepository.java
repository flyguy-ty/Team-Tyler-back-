package com.repository;

import com.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface MovieRepository extends JpaRepository<Movie,Integer> {
}
