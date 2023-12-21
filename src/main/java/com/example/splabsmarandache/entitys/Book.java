package com.example.splabsmarandache.entitys;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor(force = true)

public class Book extends Section{

    @ManyToMany
    private List<Author> authorList;


}
