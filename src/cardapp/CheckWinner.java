package cardapp;

/*
*CheckWinner.java
*after every turn checks if a player has met the win condition or not
*author: Deepkumar Patel, Harsh Pravinbhai Goti, Bikranta Singha
*created: 10th July, 2021
*modified: 12th August, 2021
*/

import java.util.ArrayList;


public class CheckWinner extends Deck {
        private static boolean winner = true;
        private Player whoWon = new Player();
        private ArrayList<Card> player1Cards = new ArrayList<Card>();
        private ArrayList<Card> player2Cards = new ArrayList<Card>();
        
	public boolean checkWinner(Player player1, Player player2) {
            
            
            player1Cards = player1.getCards();
            player2Cards = player2.getCards();
            
            if((player1Cards.get(0).getSuit() == player1Cards.get(1).getSuit()) && (player1Cards.get(1).getSuit()==player1Cards.get(2).getSuit())&& (player1Cards.get(2).getSuit()==player1Cards.get(3).getSuit())&& (player1Cards.get(3).getSuit()==player1Cards.get(4).getSuit()) ){
                setWinner(player1);
                return winner = false;
            }
            else if((player2Cards.get(0).getSuit() == player2Cards.get(1).getSuit()) && (player2Cards.get(1).getSuit()==player2Cards.get(2).getSuit())&& (player2Cards.get(2).getSuit()==player2Cards.get(3).getSuit())&& (player2Cards.get(3).getSuit()==player2Cards.get(4).getSuit()) ){
                setWinner(player2);
                return winner = false; 
            }
            
            return super.checkDeck();
	}
        public Player getWinner(){
            return whoWon;
        }
        public void setWinner(Player player){
            this.whoWon = player;
        }
}
