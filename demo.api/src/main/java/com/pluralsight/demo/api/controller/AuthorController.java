package com.pluralsight.demo.api.controller;

import com.pluralsight.demo.api.model.Author;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AuthorController {

//    //request params not preferred with id's
//    @GetMapping(path = "/authors")
//    public Author find(@RequestParam int id){
//        Author author = new Author(id, "J.K.", "Rowling");
//        return author;
//    }

    @GetMapping(path = "/authors")
    public List<Author> getAll(){
        List<Author> authors = new ArrayList<>();
        authors.add(new Author(1, "J.K.", "Rowling"));
        authors.add(new Author(2, "George", "Orwell"));
        authors.add(new Author(3, "Jane", "Austen"));
        authors.add(new Author(4, "Mark", "Twain"));
        authors.add(new Author(5, "Agatha", "Christie"));
        return authors;
    }

    @GetMapping(path = "/authors/{id}")
    public Author find(@PathVariable int id){
        Author author = new Author(id, "J.K.", "Rowling");
        return author;
    }



}
