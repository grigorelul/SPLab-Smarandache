package com.example.splabsmarandache.services;

import com.example.splabsmarandache.persistence.BookCrudRepositoryAdapter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class CommandContext {
    final private BookCrudRepositoryAdapter bookCrudRepositoryAdapter;
}
