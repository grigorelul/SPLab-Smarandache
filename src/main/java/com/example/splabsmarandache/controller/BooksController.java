package com.example.splabsmarandache.controller;

import com.example.splabsmarandache.models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BooksController {

    // Dummy list to store books (replace this with a database in a real application)
    private List<Book> books = new ArrayList<>();

    // GET method to retrieve all books
    @GetMapping
    public List<Book> getAllBooks() {
        return books;
    }

    // GET method to retrieve a specific book by ID
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        // Implement logic to find and return the book by ID
        // If not found, you can return a 404 response
        // Example: return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
        return null;
    }

    // POST method to add a new book
    @PostMapping
    public Book addBook(@RequestBody Book newBook) {
        // Implement logic to add the new book to the list or database
        // Example: books.add(newBook);
        // Return the added book
        return newBook;
    }

    // PUT method to update a book by ID
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        // Implement logic to update the book with the given ID
        // Example: Find the book by ID, update its details, and return the updated book
        return updatedBook;
    }

    // PATCH method to partially update a book by ID
    @PatchMapping("/{id}")
    public Book patchBook(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
        // Implement logic to partially update the book with the given ID
        // Example: Find the book by ID, apply the updates, and return the patched book
        return null;
    }

    // DELETE method to delete a book by ID
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        // Implement logic to delete the book with the given ID
        // Example: books.removeIf(book -> book.getId().equals(id));
    }
}
