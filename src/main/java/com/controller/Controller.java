package com.controller;


import com.model.Author;
import com.model.Movie;
import com.model.Name;
import com.model.Review;
import com.service.AuthorService;
import com.service.MovieService;
import com.service.ReviewService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class  Controller {
    @Autowired
    MovieService movieService;
    @Autowired
    ReviewService reviewService;
    @Autowired
    AuthorService authorService;

    // getting reviews by movie id
    @GetMapping("/reviews")
    public List<Review> getReviews(@RequestParam("id") int id){
        return movieService.findAllReviews(id);
    }


    @PutMapping("/postReview")
    public List<Review> postReview(@RequestParam("authorId") int authorId, @RequestParam("comment") String comment, @RequestParam("rating") double rating,
                             @RequestParam("movieId") int movieId){
        Author author = authorService.findById(authorId);
        Movie movie = new Movie();
//        List<Review> movieReviews = new ArrayList<>();
        List<Review> authorReviews = new ArrayList<>();
        boolean valid = false;
        for(int i=0;i<author.getReviews().size();i++){
            if (author.getReviews().get(i).getMovie().getId() == movieId){
                System.out.println("already has a review");
                valid = true;
                i=author.getReviews().size()-1;
                author.getReviews().get(i).setComment(comment);
                author.getReviews().get(i).setRating(rating);
                authorService.saveAuthor(author);
            }
        }
        if (!valid){
            movie.setId(movieId);

            Review review = new Review();
            review.setMovie(movie);
            review.setComment(comment);
            review.setRating(rating);
            review.setAuthor(author);

            authorReviews.add(review);
            author.setReviews(authorReviews);

//            movieReviews.add(review);
            movieService.saveMovie(movie);
            reviewService.saveReview(review);
        }
        return authorReviews;
    }



}
