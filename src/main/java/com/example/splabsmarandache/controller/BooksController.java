package com.example.splabsmarandache.controller;

import com.example.splabsmarandache.entitys.Book;
import com.example.splabsmarandache.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

//Din books controller se apeleaza comanda care apeleaza contextul care apeleaza datele relevante(colectia) care apeleaza functiile
@RequiredArgsConstructor(onConstructor_ = @Autowired)

@RestController
@RequestMapping("/books")
public class BooksController {

    private final CommandContext context;
    private final AsynchronousExecutorService asynchronousExecutorService;
    private final SynchronousExecutorService synchronousExecutorService;
    private final AllBooksSubject allBooksSubject;
    // GET method to retrieve all books
    @GetMapping
    public ResponseEntity<?> getAllBooks() {
        CommandGetAllBooks commandGetAllBooks = new CommandGetAllBooks();
        synchronousExecutorService.executeCommand(commandGetAllBooks, context);
        return new ResponseEntity<>(commandGetAllBooks.getResultAllBooks(), HttpStatus.OK);
    }

    // GET method to retrieve a specific book by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getBookById(@PathVariable Long id) {
        CommandGetBookById commandGetBookById = new CommandGetBookById(id);
        synchronousExecutorService.executeCommand(commandGetBookById, context);
        return new ResponseEntity<>(commandGetBookById.getResultGetBookById(), HttpStatus.OK);
    }

    // POST method to add a new book
    @PostMapping
    public String addBook(@RequestBody Map<String, Object> request) {
        CommandAddBook commandAddBook = new CommandAddBook(request);
        asynchronousExecutorService.executeCommand(commandAddBook, context);
        Book book = commandAddBook.getResultAddBook();
        allBooksSubject.notifyObservers(book);
        return "Cartea a fost salvată [ " + book.getTitle() + " ] ";

    }

    // PUT method to update a book by ID
    @PutMapping("/{id}")
    public ResponseEntity<?> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        CommandUpdateBook commandUpdateBook = new CommandUpdateBook(id, updatedBook);
        asynchronousExecutorService.executeCommand(commandUpdateBook, context);
        return new ResponseEntity<>(commandUpdateBook.getResultUpdateBook(), HttpStatus.OK);
    }


    // DELETE method to delete a book by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable Long id) {
        CommandDeleteBook commandDeleteBook = new CommandDeleteBook(id);
        asynchronousExecutorService.executeCommand(commandDeleteBook, context);
        return new ResponseEntity<>(commandDeleteBook.getResultDeleteBook(), HttpStatus.OK);
    }
}
