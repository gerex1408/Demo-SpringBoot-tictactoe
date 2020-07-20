package com.tictactoe.demo.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Player {

    @Id
    @GeneratedValue
    private int id;
    private char symbol;
    private String username;

    /*Methods*/
    public Player(){ }
    public Player(char symbol,String user_name){
        this.symbol=symbol;
        this.username=user_name;
    }
    public Player(char symbol){
        this.symbol=symbol;
    }
    public char getSymbol(){
        return symbol;
    }
    public String getUser_name(){
        return username;
    }
    public void setSymbol(char symbol){
        this.symbol=symbol;
    }
    public void setUser_name(String user_name) {
        this.username = user_name;
    }

    @Override
    public  String toString(){
        String s = "User Name: "+ username + ", Symbol: " + symbol;
        return s;
    }
}
