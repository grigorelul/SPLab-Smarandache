package com.example.splabsmarandache.classes;

import org.springframework.beans.propertyeditors.CharArrayPropertyEditor;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
    private List<Author> authorList = new ArrayList<>();
    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author) {
        this.authorList.add(author);
    }

    public void print()
    {
        System.out.println("Book: " + super.getTitle());
        System.out.println();
        System.out.println("Authors:");
        for(Author au: authorList)
        {
            System.out.print("Author: ");
            au.print();
        }
        System.out.println();
        for(Element elem: super.getElementList())
            elem.print();
    }


    public void addContent(Element element) throws Exception {
        try
        {
            super.add(element);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
