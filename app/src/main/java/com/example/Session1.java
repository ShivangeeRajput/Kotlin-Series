package com.example;

import java.util.Date;


public class Session1 {
    private String name;
    private Date date;

    // Constructor with default date
    public Session1(String name) {
        this(name, new Date());
    }

    // Constructor with specified date
    public Session1(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}

