package com.example.splabsmarandache.classes;

import org.springframework.beans.propertyeditors.CharArrayPropertyEditor;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authorList = new ArrayList<>();
    private List<Chapter> chapterList = new ArrayList<>();
    public Book(String title) {
        this.title = title;
    }


    public void addAuthor(Author author) {
        this.authorList.add(author);
    }

    public int createChapter(String s) {
        Chapter ch = new Chapter(s);
        this.chapterList.add(ch);
        return this.chapterList.indexOf(ch);
    }

    public Chapter getChapter(int indexChapterOne) {
        return this.chapterList.get(indexChapterOne);
    }

    public void print()
    {
        System.out.println(title);

        for(Author au: authorList)
            au.print();
        for(Chapter ch: chapterList)
            ch.print();
    }


}
