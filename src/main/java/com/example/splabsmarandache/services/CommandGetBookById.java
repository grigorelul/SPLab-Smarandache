package com.example.splabsmarandache.services;

import com.example.splabsmarandache.entitys.Book;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor

public class CommandGetBookById implements Command {
    private final Long id;
    private Book result = null;

    public void execute(CommandContext commandContext) {
        result = commandContext.getBookCrudRepositoryAdapter().findById(id).get();
    }

    public Book getResultGetBookById()
    {
        return result;
    }
}
