package com.example.splabsmarandache;

import com.example.splabsmarandache.components.*;
import com.example.splabsmarandache.models.*;
import com.example.splabsmarandache.services.BookSaveVisitor;
import com.example.splabsmarandache.services.BookStatistics;
import com.example.splabsmarandache.services.RenderContentVisitor;
import com.example.splabsmarandache.services.TableOfContentUpdate;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication

public class SpLabSmarandacheApplication {

    public static void createTableOfContent() throws Exception {
        Book b = new Book("The book");
        Section cap1 = new Section("Chapter 1");
        Section cap11 = new Section("Subchapter 1.1");
        Section cap2 = new Section("Chapter 2");
        cap1.add(new Paragraph("Paragraph 1"));
        cap1.add(new Paragraph("Paragraph 2"));
        cap1.add(new Paragraph("Paragraph 3"));

        cap11.add(new ImageProxy("ImageOne"));
        cap11.add(new Image("ImageTwo"));

        cap2.add(new Paragraph("Paragraph 4"));
        cap1.add(cap11);
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        b.addContent(cap1);
        b.addContent(cap2);
        TableOfContentUpdate tocUpdate = new TableOfContentUpdate();
        b.accept(tocUpdate);
        tocUpdate.getToC().accept(new RenderContentVisitor());
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpLabSmarandacheApplication.class, args);
        /*Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        BookStatistics stats = new BookStatistics();
        cap1.accept(stats);
        stats.printStatistics();*/
        //createTableOfContent();




//        Book b = new Book("The book");
//        Section cap1 = new Section("Chapter 1");
//        Section cap11 = new Section("Subchapter 1.1");
//        Section cap2 = new Section("Chapter 2");
//        cap1.add(new Paragraph("Paragraph 1"));
//        cap1.add(new Paragraph("Paragraph 2"));
//        cap1.add(new Paragraph("Paragraph 3"));
//
//        cap11.add(new ImageProxy("ImageOne"));
//        cap11.add(new Image("ImageTwo"));
//
//        cap2.add(new Paragraph("Paragraph 4"));
//        cap1.add(cap11);
//        cap1.add(new Paragraph("Some text"));
//        cap1.add(new Table("Table 1"));
//
//        b.addContent(cap1);
//        b.addContent(cap2);
//
//        BookSaveVisitor bookSaveVisitor = new BookSaveVisitor();
//        b.accept(bookSaveVisitor);
//        bookSaveVisitor.exportJSON();

    }
}