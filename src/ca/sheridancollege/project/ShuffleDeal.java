package ca.sheridancollege.project;

import ca.sheridancollege.project.Card.*;

public class ShuffleDeal {
    /**
     * This method shuffle the hand
     */
    public void shuffle(Player _player) {
        _player.get_hand().showCards().clear();
        deal(_player);
        deal(_player);
    }

    /**
     * This method creates random card from enums and put in to the hand
     */
    public void deal(Player _player) {
        Card _card = new Card(Card.Suit.values()[randomInt(3)], Card.Value.values()[randomInt(12)]);

        _player.get_hand().showCards().add(_player.get_hand().showCards().size(), _card);

    }

    /**
     * This method creates random number for getting the card
     */
    public int randomInt(int max) {
        int rand = (int) (Math.random() * max);
        return rand;
    }

}