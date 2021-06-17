/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapp;

import java.util.ArrayList;

public class CardApp {

	public static void main(String[] args) {

		/*for(int i=0;i<players.size();i++) {
			for(CardTemplete j: players.get(i).getCards()) {
				System.out.println(j.toString());
			}
		}*/
		//CheckCards.checkCards(players.get(0).getCards(), players.get(1).getCards());
	
		System.out.println("Welcome to java");
		GenerateCard.generateCards();
		
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player("1"));
		players.add(new Player("2"));
		players.add(new Player("1"));
		players.add(new Player("1"));
		players.add(new Player("2"));
		players.add(new Player("1"));
		players.add(new Player("1"));
		players.add(new Player("2"));
		players.add(new Player("1"));
		players.add(new Player("2"));
		players.add(new Player("1"));
		players.add(new Player("2"));
		players.add(new Player("1"));
		players.add(new Player("1"));
		players.add(new Player("2"));
		players.add(new Player("1"));
		players.add(new Player("2"));


		AssignCards randomCardGenerator = new AssignCards();


		for(int l=0;l<players.size();l++) {
			players.get(l).setCards(randomCardGenerator.generateCard());
		}



		randomCardGenerator.print();
		
		
	}
}