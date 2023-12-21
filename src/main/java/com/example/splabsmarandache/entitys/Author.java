package com.example.splabsmarandache.entitys;

import com.example.splabsmarandache.models.Element;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(force = true)

public class Author {
    @Id
    @GeneratedValue
    long id;
    @Column
    String name;
}
