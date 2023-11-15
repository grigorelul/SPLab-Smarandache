package com.example.splabsmarandache.models;

import java.util.ArrayList;
import java.util.List;

public class TableOfContent extends Element {

    private List<String>  entries = new ArrayList<>();

    public TableOfContent()
    {
    }

    public void addEntry(String entry)
    {
        this.entries.add(entry);
    }
    public void print()
    {
        System.out.println("TableOfContent");
        for(String entry: this.entries)
        {
            System.out.println(entry);
        }
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

    public void accept(Visitor visitor){
       visitor.visitTableOfContent(this);

    }

}
