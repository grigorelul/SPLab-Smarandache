package com.example.splabsmarandache.entitys;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(force = true)
public class Paragraph extends Element{
    @Column
    String text;

}
