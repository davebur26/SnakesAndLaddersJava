package com.example.user.myapplication;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/09/2017.
 */

public class GameTest {

    Game snakesAndLadders;
    Rollable dice;
    Board board;
    Player player1;
    Player player2;

    @Before
    public void before(){
        dice = Mockito.mock(Rollable.class);
        board = new Board(10);
        board.createSnakesAndLadders(2, 4);
        board.createSnakesAndLadders(8, 3);
        player1 = new Player("Disco Dave");
        player2 = new Player("Nitro Nicky");
        snakesAndLadders = new Game(dice, board);
    }

    @Test
    public void gameHasWhatItNeeds(){
        assertEquals(dice, snakesAndLadders.getDice());
        assertEquals(board, snakesAndLadders.getBoard());
    }

    @Test
    public void canAddPlayersToGame(){
        snakesAndLadders.addPlayer(player1);
        snakesAndLadders.addPlayer(player2);
        assertEquals(2, snakesAndLadders.getPlayers().size());
    }

    @Test
    public void playerMovesOnTurn(){
        snakesAndLadders.addPlayer(player1);
        Mockito.when(dice.roll()).thenReturn(4);
        snakesAndLadders.playersTurn();
        assertEquals(4, player1.getPosition());
    }

    @Test
    public void firstPlayerGoesFirst() {
        snakesAndLadders.addPlayer(player1);
        snakesAndLadders.addPlayer(player2);
        assertEquals(player1, snakesAndLadders.players.get(0));
    }

    @Test
    public void playersTakeTurns(){
        snakesAndLadders.addPlayer(player1);
        snakesAndLadders.addPlayer(player2);
        Mockito.when(dice.roll()).thenReturn(4);
        snakesAndLadders.playersTurn();
        assertEquals(player2, snakesAndLadders.players.get(0));
    }

    @Test
    public void playersCanWin() {
        snakesAndLadders.addPlayer(player1);
        Mockito.when(dice.roll()).thenReturn(9);
        snakesAndLadders.playersTurn();
        snakesAndLadders.win();
        assertEquals(player1, snakesAndLadders.getWinner());
    }

    @Test
    public void gameStopsWhenPlayerWins() {
        snakesAndLadders.addPlayer(player1);
        snakesAndLadders.addPlayer(player2);
        Mockito.when(dice.roll())
                .thenReturn(5)
                .thenReturn(4)
                .thenReturn(2)
                .thenReturn(7);
        snakesAndLadders.playersTurn();
        snakesAndLadders.playersTurn();
        snakesAndLadders.playersTurn();
        snakesAndLadders.playersTurn();
        assertEquals(player2, snakesAndLadders.getWinner());
    }

}
