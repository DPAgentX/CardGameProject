package cardapp;

/*
*CardApp.java
*contains main 
*author: Deepkumar Patel, Harsh Pravinbhai Goti, Bikranta Singha
*created: 10th July, 2021
*modified: 12th August, 2021
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CardApp {

	public static void main(String[] args) {
	
		System.out.println("Welcome to java");
		GenerateCard.generateCards();
		Scanner input = new Scanner(System.in);
                
		List<Player> players = new ArrayList<>();
                System.out.print("Enter First Player name:  ");
		players.add(Factory.createPlayer(input.next()));
                System.out.print("Enter Second Player name:  ");
		players.add(Factory.createPlayer(input.next()));
                
		AssignCards randomCardGenerator = new AssignCards();
                //randomCardGenerator.length(5);
		for(int x=0;x<players.size();x++) {
                    players.get(x).setCards(randomCardGenerator.generateCard(5));
		}
                CheckWinner checkWinner = new CheckWinner();
                PickOneCard oneCard = new PickOneCard();
                int i =0;
                while(checkWinner.checkWinner(players.get(0), players.get(1))){
                
                    if(i==0){
                        oneCard.getCard(players.get(0));
                        i=1;
                    }
                    else{
                        oneCard.getCard(players.get(1));
                        i=0;
                    }
                }
                
                Deck deck = new Deck();
                
                if(!deck.checkDeck()){
                    System.out.println("You are out of cards my frind");
                }else{
                    checkWinner.getWinner().declareWinner();
                   
                }
	}
        public static int checkCards(){
            GenerateCard.generateCards();
            return GenerateCard.getCards().length;
        }
}