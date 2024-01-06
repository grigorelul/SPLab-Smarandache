package com.example.splabsmarandache.services;

import com.example.splabsmarandache.entitys.Book;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import java.util.Map;
@RequiredArgsConstructor
public class CommandAddBook implements Command {

    private  Book newBook;
    private final Map<String, Object> request;



    public void execute(CommandContext commandContext) {
        newBook = new Book();
        newBook.setTitle((String) request.get("titlu"));
        commandContext.getBookCrudRepositoryAdapter().save(newBook);
    }

    public Book getResultAddBook()
    {
        return newBook;
    }
}
