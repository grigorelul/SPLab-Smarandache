package com.example.splabsmarandache.services;

import com.example.splabsmarandache.entitys.Book;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommandDeleteBook implements Command {

    private final Long id;
    private Book book;


    public void execute(CommandContext commandContext) {
        book = commandContext.getBookCrudRepositoryAdapter().findById(id).get();
        commandContext.getBookCrudRepositoryAdapter().deleteById(id);
    }

    public Book getResultDeleteBook()
    {
        return book;
    }
}
