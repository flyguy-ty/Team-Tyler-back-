package com.service;

import com.model.Author;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.repository.AuthorRepository;

import java.util.List;

@Component
public class AuthorService {
    AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    public List<Author> findAllUsers(){
        return authorRepository.findAll();
    }
    public Author saveUser(Author author){
        return authorRepository.save(author);
    }
}
