package com.example.giorgi.horizontalrecyclerview.custom;

/**
 * Created by giorgi on 8/5/2016.
 */
public class Person {
    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private int imageId;
    private String name;
    private String lastName;
}
