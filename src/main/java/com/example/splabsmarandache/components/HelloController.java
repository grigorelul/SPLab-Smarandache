package com.example.splabsmarandache.components;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class HelloController {

    private final ClientComponent clientComponent;

    @GetMapping("/")
    public String operation() {
        return "Hello from ClientComponent = " + clientComponent.toString();
    }
}