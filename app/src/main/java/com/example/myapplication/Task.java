package com.example.myapplication;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public Task() {
        id = UUID.randomUUID();
        date = new Date();
    }

    public void setName(String s) {
        this.name = s;
    }

    public void setDone(boolean b) {
        this.done = b;
    }

    public String getName() {
        return this.name;
    }

    public Date getDate() {
        return this.date;
    }

    public UUID getId() {
        return this.id;
    }

    public boolean isDone() {
        return this.done;
    }
}
