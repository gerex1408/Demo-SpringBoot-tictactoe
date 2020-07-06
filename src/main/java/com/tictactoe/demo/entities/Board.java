package com.tictactoe.demo.entities;

public class Board {

    char[][] taulell;
    private int size=3;

    public Board(){
        taulell=new char[size][size];
        fillWithSymbol('X');
    }
    private void fillWithSymbol(char symbol){
        for(int i=0;i<taulell.length;i++){
            for(int j=0;j<taulell[i].length;j++){
                taulell[i][j]=symbol;
            }
        }
    }
    public int getSize(){
        return size;
    }

    public char[][] getTaulell() {
        return taulell;
    }
}
