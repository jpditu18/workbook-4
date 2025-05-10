package com.pluralsight;

public class Player {
    private String name; //Name of the player
    private Hand hand; //Players card hand

    //Create a new player, set their name and give them a new hand
    public Player(String name){
        this.name = name;
        this.hand = new Hand();
    }

    //Player name
    public String getName(){
        return name;
    }
    //Player hand
    public Hand getHand(){
        return hand;
    }
}
