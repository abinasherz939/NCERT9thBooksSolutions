package com.example.ncert9thenglishbookssolutions;


public class document {
    private String name;
    private String link;

    public document()
    {
        // Empty wla constructor


    }


    public document(String name, String link) {
        this.name = name;
        this.link = link;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
