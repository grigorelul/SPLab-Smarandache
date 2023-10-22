package com.example.splabsmarandache.classes;

public class Image extends Element {
    private String imageName;

    public Image(String imageName)
    {
        this.imageName = imageName;
    }
    public void print()
    {
        System.out.println("Image with name:" + this.imageName);
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


