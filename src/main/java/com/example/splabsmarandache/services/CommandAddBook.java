package com.example.splabsmarandache.services;

import com.example.splabsmarandache.models.Book;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import java.util.Map;
@RequiredArgsConstructor
public class CommandAddBook implements Command {

    private  Book newBook;
    private final Map<String, Object> request;



    public void execute(CommandContext commandContext) {
        newBook = commandContext.getBooksService().createBook(new Book((String) request.get("titlu")));
    }

    public Book getResultAddBook()
    {
        return newBook;
    }
}
