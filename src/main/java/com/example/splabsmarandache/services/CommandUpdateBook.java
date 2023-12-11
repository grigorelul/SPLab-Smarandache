package com.example.splabsmarandache.services;

import com.example.splabsmarandache.models.Book;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CommandUpdateBook implements Command{

    private final Long id;
    private final Book copyBook;
    private Book book;

    public void execute(CommandContext commandContext) {
        book = commandContext.getBooksService().updateBook(id, copyBook);
    }

    public Book getResultUpdateBook()
    {
        return  book;
    }
}
