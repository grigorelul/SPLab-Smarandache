package com.example.splabsmarandache.services;

import com.example.splabsmarandache.models.*;

public class TableOfContentUpdate implements Visitor {

    private TableOfContent tableOfContent = new TableOfContent();
    private int page = 1;
    public TableOfContentUpdate()
    {

    }


    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {

        tableOfContent.addEntry(section.getTitle() + "..........." + page);
    }

    @Override
    public void visitTableOfContent(TableOfContent tableOfContent) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        page += 1;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        page += 1;
    }

    @Override
    public void visitImage(Image image) {
        page += 1;
    }

    @Override
    public void visitTable(Table table) {
        page += 1;
    }

    public TableOfContent getToC() {
        return this.tableOfContent;
    }

}
