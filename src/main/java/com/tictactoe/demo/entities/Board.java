package com.tictactoe.demo.entities;

public class Board {

    char[][] taulell;
    private int size=3;

    public Board(){
        taulell=new char[size][size];
    }
    public int getSize(){
        return size;
    }

}
