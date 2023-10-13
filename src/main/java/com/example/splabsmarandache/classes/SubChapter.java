package com.example.splabsmarandache.classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Element> elementList = new ArrayList<>();
    public SubChapter(String name)
    {
        this.name = name;
    }

    public void createNewParagraph(String s) {
        Paragraph para = new Paragraph(s);
        this.elementList.add(para);
        Sort();
    }

    public void createNewImage(String s) {
        Image im = new Image(s);
        this.elementList.add(im);
        Sort();
    }
    public void createNewTable(String s){
        Table t = new Table(s);
        this.elementList.add(t);
        Sort();
    }

    public void Sort()
    {
        elementList.sort(new Comparator<Element>() {
            @Override
            public int compare(Element o1, Element o2) {
                return o1.getType()- o2.getType();
            }
        });
        
    }

    public void print(){
        System.out.println("Subchapter:" + this.name);

        for(Element el : elementList)
            el.print();
    }

}
