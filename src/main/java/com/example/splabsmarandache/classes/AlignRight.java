package com.example.splabsmarandache.classes;

public class AlignRight implements AlignStrategy{
    public void Render(String context) {
        System.out.println("                " + context);
    }
}
