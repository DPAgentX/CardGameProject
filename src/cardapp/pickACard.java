/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pickACard {

	private static List<CardTemplete> cards = AssignCards.getCards();
	private CardTemplete card = new CardTemplete();
	
	public void giveCard(Player player1, Player player2) {
		
	}
	
	public CardTemplete getCard() {
		return card;
	}
	
}