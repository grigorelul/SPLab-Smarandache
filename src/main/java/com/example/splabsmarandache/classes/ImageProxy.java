package com.example.splabsmarandache.classes;

import java.awt.*;
import java.security.PublicKey;

public class ImageProxy extends  Element implements  Picture{
    private String url;
    private Dimension dim;
    private Image realImage;
    public ImageProxy(String url)
    {
        this.url = url;
    }
    public ImageProxy (String url, Dimension dim)
    {
        this.url=url;
        this.dim = dim;
    }
    public String url(){
        ;
        return null;
    }
    public Dimension dim()
    {
        ;
        return null;
    }
    public Image loadImage()
    {
        if(realImage == null)
        {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    void print() {
        loadImage();
        realImage.print();
    }
}
