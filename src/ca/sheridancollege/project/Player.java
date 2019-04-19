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
public class Player 
{
    private String playerID;
    private double money;	
    private ArrayList<Card> cards = new ArrayList<Card>();
    private Hand _hand = new Hand(cards);//the unique ID for this player
        //private ArrayList<Card> cards = new ArrayList<Card>();
    
    /**
	 * A constructor that allows you to set the player's unique ID
	 * @param name the unique ID to assign to this player.
	 * @param money
	 */
    public Player(String name, double money)
    {
        playerID= name;
        this.money = money;        
        
    }
    
    /**
     * @return the playerID
     */
    public String getPlayerID() 
    {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) 
    {
        playerID = givenID;
    }
    
    /**
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
     * @return 
     */
   

	public Hand get_hand() {
		return this._hand;
	}     
        

	public double getMoney() {
		return this.money;
	}

	/**
	 * 
	 * @param money
	 */
	public void setMoney(double money) {
		this.money = money;
	}
    
}
