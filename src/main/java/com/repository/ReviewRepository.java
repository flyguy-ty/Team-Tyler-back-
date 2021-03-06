package com.repository;


import com.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface ReviewRepository extends JpaRepository<Review, Integer> {

    Review save(Review review);

    @Query("from Review where id = :id")
    Review findById(int id);
}
