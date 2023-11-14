package com.example.splabsmarandache.models;

public class TableOfContents extends Element {

    public void print()
    {

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

    public void accept(Visitor visitor)
    {
        visitor.visitTableOfContent(this);
    }
}
