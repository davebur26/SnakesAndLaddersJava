package com.example.user.myapplication;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 13/09/2017.
 */

public class Game {

    Rollable dice;
    ArrayList<Movable> players;
    Board board;
    Movable winner;

    public Game(Rollable dice, Board board) {
        this.dice = dice;
        this.players = new ArrayList<>();
        this.board = board;
        this.winner = null;
    }

    public Rollable getDice() {
        return dice;
    }

    public ArrayList<Movable> getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }

    public void addPlayer(Movable player) {
        this.players.add(player);
    }

    public void rotatePlayers() {
        Collections.rotate(this.players, -1);
    }

    public void isPlayerOnSnakeOrLadder() {

    }

    public void playersTurn(){
        int rolledNumber = dice.roll();
        this.players.get(0).move(rolledNumber);
        if(this.win()) {
            this.getWinner();
        }
        else {
            this.rotatePlayers();
        }
    }

    public boolean win(){
        for(Movable player: this.players) {
            if (player.getPosition() >= board.winTile()) {
                winner = player;
            }
        }
        return (winner != null);
    }

    public Movable getWinner() {
        return winner;
    }
}
