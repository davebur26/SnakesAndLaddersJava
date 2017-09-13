package com.example.user.myapplication;

/**
 * Created by user on 13/09/2017.
 */

public class Player implements Movable {

    private String name;
    private int position;

    public Player(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move(int spaces) {
        this.position += spaces;
    }


}
