package com.example.splabsmarandache.controller;

import com.example.splabsmarandache.models.Book;
import com.example.splabsmarandache.services.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    // Dummy list to store books (replace this with a database in a real application)
    private BooksService books = new BooksService();

    CommandGetAllBooks getAll;
    CommandGetBookById getBookById;
    CommandUpdateBook updateBook;
    CommandDeleteBook deleteBook;
    CommandAddBook addBook;

    public BooksController()
    {
        this.getAll = new CommandGetAllBooks(books);
        this.getBookById = new CommandGetBookById(books);
        this.updateBook = new CommandUpdateBook(books);
        this.deleteBook = new CommandDeleteBook(books);
        this.addBook = new CommandAddBook(books);
    }
    // GET method to retrieve all books
    @GetMapping
    public List<Book> getAllBooks() {
        return getAll.execute();
    }

    // GET method to retrieve a specific book by ID
    @GetMapping("/{id}")
    public Book getBookByTitle(@PathVariable Long id) {
        this.getBookById.setId(id);
        return getBookById.execute();
    }

    // POST method to add a new book
    @PostMapping
    public Book addBook(@RequestBody Book newBook) {
        addBook.setAtribute(newBook);
        return addBook.execute();
    }

    // PUT method to update a book by ID
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
       this.updateBook.setAtribute(id, updatedBook);
       return this.updateBook.execute();
    }


    // DELETE method to delete a book by ID
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        this.deleteBook.setAtribute(id);
        this.deleteBook.execute();
    }
}
