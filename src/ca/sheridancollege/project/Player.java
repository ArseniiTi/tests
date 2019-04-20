/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
public class Player {
    private String playerID; //Id of player
    private double money;    //money of player
    private ArrayList<Card> cards = new ArrayList<Card>(); //array list of cards
    private Hand _hand = new Hand(cards);//the unique ID for this player

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name  the unique ID to assign to this player.
     * @param money
     */
    public Player(String name, double money) {
        playerID = name;
        this.money = money;

    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String givenID) {
        playerID = givenID;
    }


    public Hand get_hand() {
        return this._hand;
    }


    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

}
