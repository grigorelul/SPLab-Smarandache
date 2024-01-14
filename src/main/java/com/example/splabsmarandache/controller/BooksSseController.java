package com.example.splabsmarandache.controller;

import com.example.splabsmarandache.services.AllBooksSubject;
import com.example.splabsmarandache.services.SseObserver;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequiredArgsConstructor
public class BooksSseController {

    private final AllBooksSubject allBooksSubject;

    @RequestMapping("/books-sse")
    public ResponseBodyEmitter getBooksSse() {
        final SseEmitter emitter = new SseEmitter(0L);
        allBooksSubject.attach(new SseObserver(emitter));
        return emitter;
    }


}
