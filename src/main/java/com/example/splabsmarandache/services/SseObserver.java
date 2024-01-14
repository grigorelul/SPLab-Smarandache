package com.example.splabsmarandache.services;
import com.example.splabsmarandache.entitys.Book;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;


public class SseObserver implements Observer{
private final SseEmitter emitter;

    public SseObserver(SseEmitter emitter) {
        this.emitter = emitter;
    }

    @Override
    public void update(Book book) {
        try {
            emitter.send(book);
        } catch (Exception e) {
            emitter.completeWithError(e);
        }
    }

}
