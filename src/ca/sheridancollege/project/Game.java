/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import ca.sheridancollege.project.Card.Value;
import java.util.ArrayList;
import java.util.Scanner; 

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye, 2018
 */


public class Game {
 
    
   public static void main(String[] args) {
       
        Scanner console= new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter player name:");

        String userName = console.nextLine(); // Read user input

        Player _player = new Player(userName, 100);
        Dealer _dealer = new Dealer("Dealer", 100);

        System.out.println("Make a bet!");

        double bet = console.nextDouble();

        ShuffleDeal dealing = new ShuffleDeal();

        //Card _card = new Card(Card.Suit.values()[randomInt(3)],Card.Value.values()[randomInt(12)]);
        
        //System.out.print(Card.Suit.values()[randomInt(3)]);
        dealing.deal(_player);
        dealing.deal(_dealer);
        
        System.out.print(_player.get_hand().showCards().size());
        
        System.out.println("The value of your cards are: " + handValue(_player.get_hand()));

}
    static public int handValue(Hand _hand){

        int value = 0;

        for(int i = 0; i < _hand.showCards().size(); i++) {

            int tmp = _hand.showCards().get(i).getValue().ordinal();

            if (tmp==10 || tmp==11 || tmp==12) {
                tmp=9;            
            }

            if (tmp==0 || value + 11 <= 21) {
                tmp=10;            
            }


            value = value + tmp +1;
        }
    
        return value;

    }
    
    static public int randomInt(int max) {
		int rand = (int)(Math.random() * max);
		return rand;
        }

    public void declareWinner(){;

   
    

}
}
