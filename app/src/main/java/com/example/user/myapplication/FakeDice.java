package com.example.user.myapplication;

/**
 * Created by user on 13/09/2017.
 */

public class FakeDice implements Rollable{
    private int result;

    public FakeDice(int result){
        this.result = result;
    }

    public int roll(){
        return result;
    }

}
