package cardapp;

/*
*Deck.java
*checks if the card deck is empty or not
*author: Deepkumar Patel, Harsh Pravinbhai Goti, Bikranta Singha
*created: 10th July, 2021
*modified: 12th August, 2021
*/

import java.util.Arrays;
import java.util.List;


public class Deck {
    //instance variables
    private List<Card> cards = Arrays.asList(GenerateCard.getCards());
    private int emptyDeck = 0;
    
    
    public Deck(){
        
    }
    
    //prints out the card details
    public void print() {
        for(Card c: cards) {
            System.out.println(c);
        }
    }
    
    /*
     * @return cards
    */
    public List<Card> getCards(){
        return cards;
    }
    
    /*
     * @return void
     * sets cards 
    */
    public void setCards(List<Card> cards){
        this.cards = cards;
    }
    
    /*
     * @return true or false
     * checks if deck is empty
    */
    public boolean checkDeck(){
        emptyDeck = 0;
        for(int i=0;i<cards.size();i++){
            if(cards.get(i).getSuit()==null){
                emptyDeck++;
            }
        }
        
        if(emptyDeck == 52){
            return false;
        }
        return true;
    }
}
