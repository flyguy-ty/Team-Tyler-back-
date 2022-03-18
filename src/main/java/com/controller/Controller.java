package com.controller;


import com.model.Name;
import com.model.Author;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
//    @Autowired
//    UserService userService;

    @GetMapping("/")
    public String register(){
        System.out.println("requesting");
        Author author = new Author();
//        Movie movie = new Movie();
//        Review review = new Review();
        Name name = new Name();


        return author.toString();
    }

}
