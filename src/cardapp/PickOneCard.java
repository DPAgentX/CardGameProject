/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapp;

import java.util.Scanner;

public class PickOneCard extends Deck{

    //private List<CardTemplete> cards = super.getCards();
    private Card card= new Card(); 
    private int randomNumber;
    private Scanner input = new Scanner(System.in);
    private String choice;
    
    public void getCard(Player player) {
	randomNumber = (int)(Math.random()*(Card.Values.values().length * Card.Suits.values().length));
        card = super.getCards().get(randomNumber);
        while(card.getValue()==null || card.getSuit()==null){
            randomNumber = (int)(Math.random()*(Card.Values.values().length * Card.Suits.values().length));
            card = super.getCards().get(randomNumber);
        }
        super.getCards().set(randomNumber, new Card());
        System.out.println("For  "+player.getPlayerName());
        player.printCards();
        System.out.println("You got "+card.getValue()+"     "+card.getSuit());
        System.out.println("Would you like to change the card ?(yes/no)");

        
        
            choice = input.next();
            choice = choice.trim();
            while(!(choice.equalsIgnoreCase("yes")||choice.equalsIgnoreCase("no"))){
                
                System.out.println("Answer must be yes or no.\nWrite yes or no");
                choice = input.next();
                choice = choice.trim();
            }
            if(choice.equalsIgnoreCase("yes")){
                System.out.println("Which card would you like to change it with "+card.getValue()+"     "+card.getSuit());
                System.out.println("Your cards are: ");
                player.printCards();
                int temp = input.nextInt();
                player.changeCard(card, temp-1);
                System.out.println("Now your cards are ");
                player.printCards();
             
            }
            else if(choice.equalsIgnoreCase("no")){
                System.out.println("Dropped the card "+ card.getValue()+"     "+card.getSuit());
               
            }
            else{
                System.out.println("Answer must be yes or no");
            }
        
    }
	
	public Card getCard() {
		return card;
	}
	
}
