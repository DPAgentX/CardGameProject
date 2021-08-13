package cardapp;

/*
*GenerateCard.java
*generates a card for the game
*author: Deepkumar Patel, Harsh Pravinbhai Goti, Bikranta Singha
*created: 10th July, 2021
*modified: 12th August, 2021
*/

public class GenerateCard {

	private static int counter = 0;
	private static Card[] cards = new Card[Card.Suits.values().length*Card.Values.values().length];
	
	public static void generateCards() {
		
		for(Card.Suits s: Card.Suits.values()) {
			
			for(Card.Values v : Card.Values.values()) {
				
				cards[counter] = new Card(s,v);
				counter++;
			}
		}
	}
	
	public static Card[] getCards() {
		return cards;
	}
}

