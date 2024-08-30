package com.booleanuk.api.repositories;

import com.booleanuk.api.models.Author;

import java.util.ArrayList;

public class AuthorsRepository {
    private ArrayList<Author> authors;

    public AuthorsRepository(){
        this.authors=new ArrayList<>();
        this.authors.add(new Author("Isaac Asimov", "isaac@foundatio.com"));
        this.authors.add(new Author("George RR Martin", "@grrm@westeros.com"));

    }

    public ArrayList<Author> getAll(){
        return this.authors;
    }

    public Author getOne(int id){
        for (Author author:this.authors){
            if(author.getId()==id){
                return author;
            }
        }
        return null;
    }

    public Author add(Author author){
        authors.add(author);
        return author;
    }

    public Author add(String name, String email){
        Author author=new Author(name, email);
        authors.add(author);
        return author;
    }

    public Author add(String name){
        Author author=new Author(name);
        authors.add(author);
        return author;
    }

    public Author remove(Author author){

        authors.remove(author);
        return author;
    }
}
