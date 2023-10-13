package com.example.splabsmarandache.classes;

import javax.swing.plaf.PanelUI;

public class Author {
    private String name;

    public Author(String name)
    {
        this.name = name;
    }
    public void print()
    {
        System.out.println(name + "  ");
    }
}
