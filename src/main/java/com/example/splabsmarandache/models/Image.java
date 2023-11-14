package com.example.splabsmarandache.models;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image extends Element implements Picture {
    private String url;
    //private ImageContent content ;

    public Image(String url)
    {
        this.url = url;
        try{
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void accept(Visitor visitor)
    {
        visitor.visitImage(this);
    }

    public void print()
    {
        System.out.println("Image with name:" + this.url);
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

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }
}


