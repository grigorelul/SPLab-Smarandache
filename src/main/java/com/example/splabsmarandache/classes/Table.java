package com.example.splabsmarandache.classes;

public class Table implements Element {
    private String title;

    public Table(String title)
    {
        this.title = title;
    }
    public void print()
    {
        System.out.println("Table with Title:  " + this.title);
    }

    @Override
    public void add(Element elem) {

    }

    @Override
    public void remove(Element elem) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

}
