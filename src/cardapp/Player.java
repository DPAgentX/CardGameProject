/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapp;


public class Player {
	
	private String playerName;
	public static int position = 0;
	private CardTemplete[] cards = new CardTemplete[3];
	
	public Player() {
		position++;
	}
	public Player(String playerName) {
		this.playerName = playerName;
		position++;
	}
	
	public String getPlayerName() {
		return this.playerName;
	}
	
	public CardTemplete[] getCards() {
		return cards;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void setCards(CardTemplete[] cards){
		this.cards = cards;
	}
	public void printCards() {
		for(int i=0; i<cards.length;i++) {
			System.out.println(cards[i].getSuit() + "     "+cards[i].getValue());
		}
	}
	
}

