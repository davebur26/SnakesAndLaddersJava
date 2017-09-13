package com.example.user.myapplication;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/09/2017.
 */

public class BoardTest {

    Board board;

    @Before
    public void before() {
        board = new Board(10);
        board.createSnakesAndLadders(2, 4);
        board.createSnakesAndLadders(8, 3);
    }

    @Test
    public void testArraySizeIsCorrect(){
        assertEquals(10, board.getSizeOfBoard().size());
    }

    @Test
    public void testWinTile(){
        assertEquals(9,board.winTile());
    }

    @Test
    public void boardHasSnakesAndLadders() {
        assertEquals(2, board.getPositions().size());
    }

}
