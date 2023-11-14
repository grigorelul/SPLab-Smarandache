package com.example.splabsmarandache.services;

public class AlignRight implements AlignStrategy{
    public void Render(String context) {
        System.out.println("                " + context);
    }
}
