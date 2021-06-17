/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapp;


public class CheckCards {

	public static void checkCards(CardTemplete[] player1, CardTemplete[] player2) {
		
		for(int i=0;i<player1.length;i++) {
			for(int j=0;j<player2.length;j++) {
				
				if(player1[i].equals(player2[j])) {
					System.out.println("YOU SUCK BRO");
				}
			}
		}
	}
}
