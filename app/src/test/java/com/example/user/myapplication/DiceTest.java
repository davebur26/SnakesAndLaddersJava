package com.example.user.myapplication;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/09/2017.
 */

public class DiceTest {

    Dice dice;

    @Before
    public void before(){
        dice = new Dice(6);
    }

    @Test
    public void diceHasSides(){
        assertEquals(6, dice.getNumberOfSides());
    }

    @Test
    public void diceCanRoll(){
        int rolledNumber = dice.roll();
        boolean validRoll = 1 <= rolledNumber && rolledNumber <= 6;
        assertEquals(true, validRoll);

    }

}
