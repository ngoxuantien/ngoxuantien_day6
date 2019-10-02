package com.example.rycyclerview;

import java.io.Serializable;

public class contact_tien implements Serializable {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public contact_tien(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public contact_tien() {

    }
}
