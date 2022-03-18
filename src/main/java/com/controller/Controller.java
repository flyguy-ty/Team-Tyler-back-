package com.controller;


import com.model.Name;
import com.model.Author;
import com.model.Review;
import com.service.MovieService;
import com.service.ReviewService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
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


    // getting reviews by movie id
    @GetMapping("/reviews")
    public List<Review> register(@RequestParam("id") int id){
        Review review = new Review();
        return movieService.findAllReviews(id);
    }



}
