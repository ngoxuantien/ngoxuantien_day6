package com.example.rycyclerview;

import java.io.Serializable;

public class Contact implements Serializable {
    private int anh;

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact(int anh, String name) {
        this.anh = anh;
        this.name = name;
    }
    public Contact() {

    }

    private String name;
}

