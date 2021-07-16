/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapp;

public class GenerateCard {

	private static int counter = 0;
	private static CardTemplete[] cards = new CardTemplete[CardTemplete.Suits.values().length*CardTemplete.Values.values().length];
	
	public static void generateCards() {
		
		for(CardTemplete.Suits s: CardTemplete.Suits.values()) {
			
			for(CardTemplete.Values v : CardTemplete.Values.values()) {
				
				cards[counter] = new CardTemplete(s,v);
				counter++;
			}
		}
	}
	
	public static CardTemplete[] getCards() {
		return cards;
	}
}

