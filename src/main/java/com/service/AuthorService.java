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

    public Author findById(int author){
        return authorRepository.findById(author);
    }
    public Author saveAuthor(Author author){
        return authorRepository.save(author);
    }
}
