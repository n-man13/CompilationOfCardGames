package blackjack;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> deck;

	public Deck() {
		for (int i = 2; i < 10; i++) {
			deck.add(new Card(i + "c"));
			deck.add(new Card(i + "d"));
			deck.add(new Card(i + "h"));
			deck.add(new Card(i + "s"));
		}
		deck.add(new Card("ac"));
		deck.add(new Card("ad"));
		deck.add(new Card("ah"));
		deck.add(new Card("as"));
		deck.add(new Card("jc"));
		deck.add(new Card("jd"));
		deck.add(new Card("jh"));
		deck.add(new Card("js"));
		deck.add(new Card("kc"));
		deck.add(new Card("kd"));
		deck.add(new Card("kh"));
		deck.add(new Card("ks"));
		deck.add(new Card("qc"));
		deck.add(new Card("qd"));
		deck.add(new Card("qh"));
		deck.add(new Card("qs"));
		deck.add(new Card("tc"));
		deck.add(new Card("td"));
		deck.add(new Card("th"));
		deck.add(new Card("ts"));
	}

	public Card get(int index){
		return deck.get(index);
	}
	
	public void shuffle() {
		for (int i = 0; i < deck.size(); i++) {
			swap(i, (int) Math.random() * 52);
		}
	}

	private void swap(int index, int index2) {
		Card temp = deck.get(index);
		deck.set(index, deck.get(index2));
		deck.set(index2, temp);
	}
}
