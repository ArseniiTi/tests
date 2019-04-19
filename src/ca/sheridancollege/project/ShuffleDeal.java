package ca.sheridancollege.project;

import ca.sheridancollege.project.Card.*;

public class ShuffleDeal {

	public void shuffle(Player _player) {
            _player.get_hand().showCards().clear();
            deal(_player);
            deal(_player);
	}

	
	public void deal(Player _player) {
         Card _card = new Card(Suit.values()[randomInt(3)],Value.values()[randomInt(12)]);
         
         _player.get_hand().showCards().add(_card);
		
	}
        
        public int randomInt(int max) {
		int rand = (int)(Math.random() * max);
		return rand;
        }

}