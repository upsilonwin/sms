package com.upsilonwin.sms.business.hello.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ToDoTask implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private boolean done;

    public ToDoTask() {
    }

    public ToDoTask(String description, boolean done) {
        this.description = description;
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}