package com.example.splabsmarandache.models;

import java.awt.*;

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

    public void accept(Visitor visitor)
    {
        visitor.visitImageProxy(this);
    }
    @Override
    public void print() {
        loadImage();
        realImage.print();
    }

    public String getUrl() {
        return url;
    }
}
