package com.example.user.myapplication;

import java.util.Random;

/**
 * Created by user on 13/09/2017.
 */

public class Dice {
    private int numberOfSides;


    public Dice(int numberOfSides){
        this.numberOfSides = numberOfSides;
    }

    public int roll(){
        return randomNumber(1, this.numberOfSides);
    }

    public int randomNumber(int min, int max){
        Random rand = new Random();
        int result = rand.nextInt((max - min) + 1) + min;
        return result;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

}