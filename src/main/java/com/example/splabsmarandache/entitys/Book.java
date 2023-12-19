package com.example.splabsmarandache.entitys;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor(force = true)
public class Book {

    @Id
    @GeneratedValue
    long id;
    @ManyToMany(mappedBy = "author")
    private List<Author> authorList;

//    @ManyToMany
//    @JoinTable(name = "author_book",
//            joinColumns = @JoinColumn(name = "book_id"),
//            inverseJoinColumns = @JoinColumn(name = "author_id"))
//    private List<Author> authors;

    // constructor, getters and setters

}
