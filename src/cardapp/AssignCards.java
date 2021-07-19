
package cardapp;


import java.util.List;


public class AssignCards extends Deck{
	
	//private List<CardTemplete> cards = Arrays.asList(GenerateCard.getCards());
	
	/*public void print() {
            for(CardTemplete c: cards) {
		System.out.println(c);
            }
	}*/
	
	//private List<CardTemplete> cards = super.getCards();
        
	public Card[] generateCard() {
		
                
		Card[] threeCards = new Card[3];
		int randomNumber;
		for(int i=0;i<threeCards.length;i++) {

			randomNumber = (int)(Math.random()*(Card.Values.values().length * Card.Suits.values().length));
			threeCards[i] = super.getCards().get(randomNumber);
			while(threeCards[i].getValue()==null || threeCards[i].getSuit()==null) {
				randomNumber = (int)(Math.random()*(Card.Values.values().length * Card.Suits.values().length));
				threeCards[i] = super.getCards().get(randomNumber);
			}
			super.getCards().set(randomNumber, new Card());
                        super.setCards(super.getCards());
		}
		return threeCards;
	}

        @Override
	public  List<Card> getCards() {
		return super.getCards();
	}
}
