package com.example.splabsmarandache.classes;

public class Paragraph implements Element{
    private String text;

    public Paragraph(String text)
    {
        this.text = text;
    }
    public void print()
    {
        System.out.println("Paragraph: " + this.text);
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
