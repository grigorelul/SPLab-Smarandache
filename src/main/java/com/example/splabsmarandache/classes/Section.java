package com.example.splabsmarandache.classes;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String title;
    private List<Element> elementList = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
    public List<Element> getElementList()
    {
        return elementList;
    }
    public void print() {
        System.out.println(title);
        for(Element elem : elementList)
            elem.print();
    }

    public void add(Element elem) {
        elementList.add(elem);
    }

    public void remove(Element elem){
        elementList.remove(elem);
    }

    public Element get(int index) {
        return this.elementList.get(index);
    }


}
