package com.example.splabsmarandache.services;

import com.example.splabsmarandache.models.*;

public class BookStatistics implements  Visitor{

    private int images=0;
    private int paragrafs=0;
    private int tables=0;
    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {

    }

    @Override
    public void visitTableOfContent(TableOfContent tableOfContent) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragrafs +=1;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        images += 1;
    }

    @Override
    public void visitImage(Image image) {
        images += 1;
    }

    @Override
    public void visitTable(Table table) {

        tables += 1 ;
    }
    public void printStatistics()
    {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: " + images);
        System.out.println("*** Number of tables: "+ tables);
        System.out.println("*** Number of paragraphs: " + paragrafs);
    }
}
