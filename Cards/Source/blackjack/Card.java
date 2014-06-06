package blackjack;

public class Card {
	private String name;
	private int offset;
	
	public Card(String name, int offset){
		this.name = name;
		this.offset = offset;
	}
	public Card(String name){
		this.name = name;
		this.offset = 0;
	}
	public String getName(){
		return name;
	}
	public int getOffset(){
		return offset;
	}
}
