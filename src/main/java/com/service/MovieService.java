package com.service;

import com.model.Author;
import com.model.Review;
import com.repository.AuthorRepository;
import com.repository.MovieRepository;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class MovieService {
    MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public List<Review> findAllReviews(int id){
        return movieRepository.findAllReviews(id);
    }
}
