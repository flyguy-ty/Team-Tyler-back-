package com.repository;


import com.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
