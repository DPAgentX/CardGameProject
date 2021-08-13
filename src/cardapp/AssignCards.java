package cardapp;

/*
*AssignCards.java
*Assigns random cards
*author: Deepkumar Patel, Harsh Pravinbhai Goti, Bikranta Singha
*created: 10th July, 2021
*modified: 12th August, 2021
*/


import java.util.ArrayList;
import java.util.List;



public class AssignCards extends Deck{
	
        public AssignCards(){
            
        }           
        
        /*
        *@return an ArrayList containing a specified number of cards
        */
	public ArrayList<Card> generateCard(int x) {
            ArrayList<Card> threeCards = new ArrayList<>();
            
            //generates the given number of cards
            for(int i = 0;i<x;i++){
                threeCards.add(new Card());
            }
        
		int randomNumber;
		for(int i=0;i<threeCards.size();i++) {
                        
                        //sets the card suit and value
			randomNumber = (int)(Math.random()*(Card.Values.values().length * Card.Suits.values().length));
			threeCards.set(i, super.getCards().get(randomNumber));
                        
			while(threeCards.get(i).getValue()==null || threeCards.get(i).getSuit()==null) {
				randomNumber = (int)(Math.random()*(Card.Values.values().length * Card.Suits.values().length));
				threeCards.set(i,super.getCards().get(randomNumber));
                                
			}
			super.getCards().set(randomNumber, new Card());
                        super.setCards(super.getCards());
		}
		return threeCards;
	}
        
        
        //Overriding the getCards() method in Deck
        @Override
	public  List<Card> getCards() {
		return super.getCards();
	}
}
