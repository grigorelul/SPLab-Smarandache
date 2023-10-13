package com.example.splabsmarandache.classes;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Paragraph> paragraphList = new ArrayList<>();
    private List<Image> imageList = new ArrayList<>();
    private List<Table> tableList = new ArrayList<>();
    public SubChapter(String name)
    {
        this.name = name;
    }

    public void createNewParagraph(String s) {
        Paragraph para = new Paragraph(s);
        this.paragraphList.add(para);
    }

    public void createNewImage(String s) {
        Image im = new Image(s);
        this.imageList.add(im);
    }
    public void createNewTable(String s){
        Table t = new Table(s);
        this.tableList.add(t);
    }
    public void print(){
        System.out.println("Subchapter:" + this.name);

        for(Paragraph para : paragraphList) {
            para.print();
        }
        for (Image im : imageList) {
            im.print();
        }
        for(Table tab :tableList) {
            tab.print();
        }

    }

}
