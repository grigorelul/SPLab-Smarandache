package com.example.splabsmarandache.classes;

import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapterList = new ArrayList<>();
    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String s) {
        SubChapter sub = new SubChapter(s);
        this.subChapterList.add(sub);
        return  this.subChapterList.indexOf(sub);
    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return this.subChapterList.get(indexSubChapterOneOne);
    }
    public void print()
    {
        System.out.println(this.name);
        for(SubChapter ch : subChapterList)
            ch.print();
    }

}
