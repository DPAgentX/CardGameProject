package cardapp;

import java.util.ArrayList;
import java.util.Scanner;
public class CardApp {

	public static void main(String[] args) {
	
		System.out.println("Welcome to java");
		GenerateCard.generateCards();
		Scanner input = new Scanner(System.in);
                
		ArrayList<Player> players = new ArrayList<>();
                System.out.print("Enter First Player name:  ");
		players.add(new Player(input.next()));
                System.out.print("Enter Second Player name:  ");
		players.add(new Player(input.next()));

                
		AssignCards randomCardGenerator = new AssignCards();
		for(int l=0;l<players.size();l++) {
			players.get(l).setCards(randomCardGenerator.generateCard());
		}
                CheckWinner checkWinner = new CheckWinner();
                PickOneCard oneCard = new PickOneCard();
                int i =0;
                while(checkWinner.checkWinner(players.get(0), players.get(1))){
                
                    if(i==0){
                        oneCard.giveCard(players.get(0));
                        i=1;
                    }
                    else{
                        oneCard.giveCard(players.get(1));
                        i=0;
                    }
                }
                
                Deck deck = new Deck();
                
                if(!deck.checkDeck()){
                    System.out.println("You are out of cards my frind");
                }else{
                    System.out.println(checkWinner.getWinner().toString());
                    checkWinner.getWinner().printCards();
                }
	}
}