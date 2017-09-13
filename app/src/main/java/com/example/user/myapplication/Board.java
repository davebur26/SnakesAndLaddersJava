package com.example.user.myapplication;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 13/09/2017.
 */

public class Board {

    int numberOfTiles;
    HashMap<Integer, Integer> positions;
    ArrayList<Integer> sizeOfBoard;

    public Board(int numberOfTiles) {
        this.numberOfTiles = numberOfTiles;
        this.positions = new HashMap<>();
        this.sizeOfBoard = new ArrayList<>();
        this.createBoardSize(numberOfTiles);
    }

    public int getNumberOfTiles() {
        return numberOfTiles;
    }

    public HashMap<Integer, Integer> getPositions() {
        return positions;
    }

    public ArrayList<Integer> getSizeOfBoard() {
        return sizeOfBoard;
    }

    public void createBoardSize(int numberOfTiles) {
        for(int i = 0; i < numberOfTiles; i++) {
            sizeOfBoard.add(0);
        }
    }

    public int winTile(){
        return sizeOfBoard.size() - 1;
    }

    public void createSnakesAndLadders(int start, int end){
        this.sizeOfBoard.add(start, end);
    }



}
