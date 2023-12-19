package com.example.splabsmarandache.persistence;

import com.example.splabsmarandache.entitys.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

    
}
