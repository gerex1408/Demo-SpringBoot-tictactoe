package com.tictactoe.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Content {
    @Id
    @GeneratedValue
    private int id;
    private String unicTitle;
    private String title;
    private String content;

    public Content(){ }
    public Content(String content){
        this.content=content;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content) {
        this.content= content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUnicTitle() {
        return unicTitle;
    }

    public void setUnicTitle(String unicTitle) {
        this.unicTitle = unicTitle;
    }
}
