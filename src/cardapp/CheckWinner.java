/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapp;

import java.util.ArrayList;

public class CheckWinner extends Deck{
        private static boolean winner = true;
        private Player whoWon = new Player();
        //private Card[] player1Cards = new Card[5];
        //private Card[] player2Cards = new Card[5];
        private ArrayList<Card> player1Cards = new ArrayList<Card>();
        private ArrayList<Card> player2Cards = new ArrayList<Card>();
        
	public boolean checkWinner(Player player1, Player player2) {
            
            
            player1Cards = player1.getCards();
            player2Cards = player2.getCards();
            /*if((player1Cards[0].getSuit() == player1Cards[1].getSuit()) && (player1Cards[1].getSuit()==player1Cards[2].getSuit()) && (player1Cards[2].getSuit()==player1Cards[3].getSuit())&& (player1Cards[3].getSuit()==player1Cards[4].getSuit())){
                setWinner(player1);
                return false;
            }
            else if((player2Cards[0].getSuit() == player2Cards[1].getSuit()) && (player2Cards[1].getSuit()==player2Cards[2].getSuit())&& (player2Cards[2].getSuit()==player2Cards[3].getSuit())&& (player2Cards[3].getSuit()==player2Cards[4].getSuit())){
                setWinner(player2);
                return false; 
            }*/
            if((player1Cards.get(0).getSuit() == player1Cards.get(1).getSuit()) && (player1Cards.get(1).getSuit()==player1Cards.get(2).getSuit())&& (player1Cards.get(2).getSuit()==player1Cards.get(3).getSuit())&& (player1Cards.get(3).getSuit()==player1Cards.get(4).getSuit()) ){
                setWinner(player1);
                return winner = false;
            }
            else if((player2Cards.get(0).getSuit() == player2Cards.get(1).getSuit()) && (player2Cards.get(1).getSuit()==player2Cards.get(2).getSuit())&& (player2Cards.get(2).getSuit()==player2Cards.get(3).getSuit())&& (player2Cards.get(3).getSuit()==player2Cards.get(4).getSuit()) ){
                setWinner(player2);
                return winner = false; 
            }
            /*for(int i =0;i<1;i++){
                for(int j=0;j<5;j++){
                    if(player1Cards.get(i).getSuit() == player1Cards.get(j).getSuit()){
                        winner = false;
                        setWinner(player1);
                    }
                    else{
                        winner = true;
                    }
                    if(winner==true){
                        break;
                    }
                }
            }*/
            return super.checkDeck();
	}
        public Player getWinner(){
            return whoWon;
        }
        public void setWinner(Player player){
            this.whoWon = player;
        }
}
