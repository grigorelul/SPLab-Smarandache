package com.example.splabsmarandache.models;

public interface Visitor  {
    void visitBook (Book book);
    void visitSection(Section section);
    void visitTableOfContent(TableOfContents tableOfContents);
    void visitParagraph(Paragraph paragraph);
    void visitImageProxy(ImageProxy imageProxy);
    void visitImage(Image image);
    void visitTable(Table table);
}
