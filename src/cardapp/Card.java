package cardapp;

public class Card {

	public enum Values{
		ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING;
	}
	public enum Suits{
		HEART,DIAMOND,SPADES,CLUBS;
	}
	
	private final Values value;
	private final Suits suit;
	
	public Card(Card.Suits s, Card.Values v) {
		this.value = v;
		this.suit = s;
	}
	public Card() {
		this.value=null;
		this.suit=null;
	}
	public Values getValue(){
		
		return this.value;
	}
	
	public Suits getSuit() {
		return this.suit;
	}
	public String toString() {
		return (getValue() + "     " + getSuit());
	}
}

