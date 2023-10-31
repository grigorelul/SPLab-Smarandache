package com.example.splabsmarandache.classes;

public class Paragraph extends Element{
    private String text;
    private AlignStrategy textAlignement = null;

    public Paragraph(String text)
    {
        this.text = text;
    }
    public void print()
    {
        if (textAlignement == null)
            System.out.println(text);
        else
            textAlignement.Render(text);

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


    public void setAlignStrategy(AlignStrategy alignStrategy) {
        textAlignement = alignStrategy;
    }
}
