package com.example.splabsmarandache.services;

import com.example.splabsmarandache.models.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BooksService {

    private final Map<Long, Book> books = new HashMap<>();
    private long nextId = 1;

    public Book createBook(Book bookData) {
        long bookId = getNextId();
        books.put(bookId, bookData);
        return books.get(bookId);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books.values());
    }

    public Book getBookById(Long bookId) {
        return books.get(bookId);
    }

    public Book updateBook(Long bookId, Book updatedBookData) {
        if (books.containsKey(bookId)) {
            books.put(bookId, updatedBookData);
        }
        return getBookById(bookId);
    }

    public Book deleteBook(Long bookId) {
        Book book = getBookById(bookId);
        books.remove(bookId);
        return book;
    }
    private synchronized long getNextId() {
        return nextId++;
    }
}
