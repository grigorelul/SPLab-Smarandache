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
    public int getType()
    {
        return 1;
    }
}
