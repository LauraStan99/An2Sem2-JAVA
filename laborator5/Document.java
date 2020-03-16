package com.company;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Document implements Serializable {

    private String id;
    private String name;
    private String location;
    private Map<String, Object> tags = new HashMap<>();

    public Document(String newId , String newName, String newLocation)
    {
        this.id=newId;
        this.name=newName;
        this.location=newLocation;
    }


    public void addTag(String key, Object obj) {
        tags.put(key, obj);
    }

    public Object getId() {
        return id;
    }
    public String getLocation()
    {
        return location;
    }

    public String getName() {
        return name;
    }

    public Map<String, Object> getTags() {
        return tags;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTags(Map<String, Object> tags) {
        this.tags = tags;
    }
}
