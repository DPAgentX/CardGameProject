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
    
    
        //main to start the game
	public static void main(String[] args) {
	
		System.out.println("Welcome to java");
		GenerateCard.generateCards();
		Scanner input = new Scanner(System.in);
                
                //getting player info
		List<Player> players = new ArrayList<>();
                System.out.print("Enter First Player name:  ");
		players.add(Factory.createPlayer(input.next()));
                System.out.print("Enter Second Player name:  ");
		players.add(Factory.createPlayer(input.next()));
                
                //assigning cards to players
		AssignCards randomCardGenerator = new AssignCards();
		for(int x=0;x<players.size();x++) {
                    players.get(x).setCards(randomCardGenerator.generateCard(5));
		}
                
                //checks winner
                CheckWinner checkWinner = new CheckWinner();
                
                //continues the game with 1 card swap option for each player
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
                
                //generates the rest of the deck
                Deck deck = new Deck();
                
                //check if deck is empty or a winner has already been found
                if(!deck.checkDeck()){
                    System.out.println("You are out of cards my friend");
                }else{
                    checkWinner.getWinner().declareWinner();
                   
                }
	}
        
        /*
         *@return GenerateCard.getCards().length
        */
        public static int checkCards(){
            GenerateCard.generateCards();
            return GenerateCard.getCards().length;
        }
}