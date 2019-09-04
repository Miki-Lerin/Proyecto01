package card;

import java.util.ArrayList;

public class CardDB {
	
    private ArrayList<Card> cards;
    private String dbName;
	
	
	public CardDB(String name) {
		this.cards = new ArrayList<Card>();
		this.dbName = name;
	}

	
	public void addCard(Card card) {
		this.cards.add(card);
	}
	
	
	public ArrayList<Card> getArray() {
		return this.cards;
		}
	
	
	public int arraySize() {
		return this.cards.size();
	}
	
	
  // get dataPersons versus index
	public Card getCard(int miindex) {
	   return this.cards.get(miindex);
	   }
	
	
	public ArrayList<Card> getCards() {
		return cards;
	}


	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}


	public String getDbName() {
		return dbName;
	}


	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
}
