
package cardapp;


import java.util.List;
import java.util.Arrays;

public class AssignCards {
	
	private static List<CardTemplete> cards = Arrays.asList(GenerateCard.getCards());
	
	 public void print() {
		 for(CardTemplete c: cards) {
			 System.out.println(c);
		 }
	 }
	
	
	public CardTemplete[] generateCard() {
		
		CardTemplete[] threeCards = new CardTemplete[3];
		int randomNumber;
		for(int i=0;i<threeCards.length;i++) {

			randomNumber = (int)(Math.random()*(CardTemplete.Values.values().length * CardTemplete.Suits.values().length));
			threeCards[i] = cards.get(randomNumber);
			while(threeCards[i].getValue()==null || threeCards[i].getSuit()==null) {
				randomNumber = (int)(Math.random()*(CardTemplete.Values.values().length * CardTemplete.Suits.values().length));
				threeCards[i] = cards.get(randomNumber);
			}
			cards.set(randomNumber, new CardTemplete());
		}
		return threeCards;
	}
}
