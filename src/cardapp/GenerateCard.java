/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapp;

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

