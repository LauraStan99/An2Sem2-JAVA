package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Serializable {
    private String name;
    private String path;
    private List<Document> documents = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
    public Catalog(){}

    public Catalog(String newName, String newPath)
    {
        this.name=newName;
        this.path=newPath;
    }
    public void add(Document doc) {
        documents.add(doc);
    }
    public Document findById(String id) {
        for (Document doc : documents) {
            if (doc.getId().equals(id)) {
                return doc;
            }
        }
        return null;
    }

    public String getPath() {
        return path;
    }
    public String getName(){
        return name;
    }
    public List<Document> getDocuments() {
        return documents;
    }
}