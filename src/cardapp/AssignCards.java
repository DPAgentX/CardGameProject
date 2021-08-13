
package cardapp;


import java.util.ArrayList;
import java.util.List;



public class AssignCards extends Deck{
	
        //private Card[] threeCards = new Card[5];
        
        
        
	public ArrayList<Card> generateCard(int x) {
            ArrayList<Card> threeCards = new ArrayList<>();
            for(int i = 0;i<x;i++){
                threeCards.add(new Card());
            }
        
		int randomNumber;
		for(int i=0;i<threeCards.size();i++) {
                        
			randomNumber = (int)(Math.random()*(Card.Values.values().length * Card.Suits.values().length));
			threeCards.set(i, super.getCards().get(randomNumber));
                        //threeCards.get(i) = super.getCards().get(randomNumber);
			while(threeCards.get(i).getValue()==null || threeCards.get(i).getSuit()==null) {
				randomNumber = (int)(Math.random()*(Card.Values.values().length * Card.Suits.values().length));
				threeCards.set(i,super.getCards().get(randomNumber));
                                //threeCards[i] = super.getCards().get(randomNumber);
			}
			super.getCards().set(randomNumber, new Card());
                        super.setCards(super.getCards());
		}
		return threeCards;
	}

        @Override
	public  List<Card> getCards() {
		return super.getCards();
	}
}
