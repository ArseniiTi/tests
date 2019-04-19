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
       
       String play = "y"; 
       Scanner console= new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter player name:");

        String userName = console.nextLine(); // Read user input

        Player _player = new Player(userName, 100);
        Dealer _dealer = new Dealer("Dealer", 100);

        while (play.equals("y")){
            System.out.println("Make a bet!");

            double bet = console.nextDouble();
            
            if (_player.getMoney()<bet){
                bet = _player.getMoney();
                System.out.println("No money for that bet! You are betting what you have left instead: " + bet);
            }

            ShuffleDeal dealing = new ShuffleDeal();

            //Card _card = new Card(Card.Suit.values()[randomInt(3)],Card.Value.values()[randomInt(12)]);

            //System.out.println(Card.Suit.values()[randomInt(3)]);
            dealing.shuffle(_player);
            dealing.shuffle(_dealer);

            //System.out.println(_player.get_hand().showCards().size() + "   " + randomInt(3));

            System.out.println("The value of your cards are: " + handValue(_player.get_hand()));
            System.out.println("Dealer shows: " + _dealer.get_hand().showCards().get(0).getValue() + " of " +_dealer.get_hand().showCards().get(0).getSuit());

            System.out.println("Hit? Type y for Hit and n for Stay");
            String confirm = console.nextLine();
            console.nextLine();

            while (confirm.equals("y")){           

                dealing.deal(_player);
                System.out.println("You drew: " + _player.get_hand().showCards().get(0).getValue() + " of " +_player.get_hand().showCards().get(0).getSuit());
                System.out.println("The value of your cards are: " + handValue(_player.get_hand()));                     

                if (handValue(_player.get_hand()) >21){
                    declareWinner(_player, bet, _dealer);
                    confirm="";
                }
                else {
                    System.out.println("Hit? Type y for Hit and n for Stay");
                    confirm = console.nextLine();
                }
            }

            if (handValue(_player.get_hand()) <=21){

                while (handValue(_dealer.get_hand())<16){
                    System.out.println("dealer under 16, hitting");
                    dealing.deal(_dealer);
                }

                declareWinner(_player, bet, _dealer);
            }
            
            if (_player.getMoney()>0){
            
            System.out.println("Play again? Type y for yes, n for no");
            play= console.nextLine();
            }
            
            else play = "";
            System.out.println("Out of money! Please visit the nearest ATM or loan shark!");
            
        }
}
    static public int handValue(Hand _hand){

        int value = 0;

        for(int i = 0; i < _hand.showCards().size(); i++) {

            int tmp = _hand.showCards().get(i).getValue().ordinal();

            if (tmp==10 || tmp==11 || tmp==12) {
                tmp=9;            
            }

            if (tmp==0 && value + 11 <= 21) {
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

    static public void declareWinner(Player player, double playbet, Player dealer){   
        int valuePlayer = handValue(player.get_hand());
        int valueDealer = handValue(dealer.get_hand());
        
        if (valuePlayer >21){
            System.out.println("You lose, busted out! Your value:" +  valuePlayer);
            player.setMoney(player.getMoney()-playbet);
        }
        else if (valueDealer > 21){
            System.out.println( "You win, dealer busted out! Dealer value:" +  valueDealer);
            player.setMoney(player.getMoney()+playbet);
        }
        else if (valuePlayer > valueDealer){
            System.out.println("You win! You got " + valuePlayer + " and dealer got " + valueDealer + "!");
            player.setMoney(player.getMoney()+playbet);
        }
        else {
            System.out.println( "You lose! You got " + valuePlayer + " and dealer got " + valueDealer + "!");
            player.setMoney(player.getMoney()-playbet);
        }        
       
    }
}
