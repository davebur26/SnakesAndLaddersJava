package com.example.user.myapplication;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/09/2017.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player("Triathlon");
    }

    @Test
    public void canGetPlayerName() {
        assertEquals("Triathlon", player.getName());
    }

    @Test
    public void playerStartsAtPositionZero() {
        assertEquals(0, player.getPosition());
    }

}