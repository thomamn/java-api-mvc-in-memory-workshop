package com.booleanuk.api.controllers;

import com.booleanuk.api.models.Author;
import com.booleanuk.api.repositories.AuthorsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("authors")
public class AuthorsController {
    private AuthorsRepository theAuthors;
    public AuthorsController(){
        this.theAuthors=new AuthorsRepository();

    }

    @GetMapping
    public ArrayList<Author> getAllAuthors(){
        return this.theAuthors.getAll();
    }

    @GetMapping("/{id}")
    public Author getSpecificAuthor(@PathVariable int id){
        return this.theAuthors.getOne(id);
    }

    @PostMapping("/{name}")
    public Author addAuthor(@PathVariable String name){
        return theAuthors.add(name);

    }

    @PostMapping("/{name}")
    public Author addAuthor(@RequestBody Author author){
        return theAuthors.add(author);

    }

    @PutMapping("/{name}")
    public Author changeAuthor(@RequestBody Author author, @PathVariable String name){
        for (Author a:theAuthors.getAll()){
            if(a.getName()==name){
                a.setName(author.getName());
                a.setEmail(author.getEmail());
                return a;
            }
        }
        return null;
    }

    @DeleteMapping("/{name}")
    public Author changeAuthor(@PathVariable String name){
        for (Author a:theAuthors.getAll()){
            if(a.getName()==name){
                return theAuthors.remove(a);
            }
        }
        return null;
    }









}
