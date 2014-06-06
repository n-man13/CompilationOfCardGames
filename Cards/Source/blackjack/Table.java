package blackjack;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;
import processing.core.PImage;

public class Table extends PApplet {
	private PImage p;
	private ArrayList<Deck> d = new ArrayList<Deck>();
	int offset;

	public void setup() {
		this.p = loadImage("BlackJackTable.jpg");
	}

	public void draw() {
		//for (int i = 0; i < 6; i++){
		//	d.add(i,new Deck());
		//}
		image(p, 0, 0);
		ArrayList<Card> c=new ArrayList<Card>();
		c.add(new Card("ac",50));
		drawCards(new Point(100,100), 0,c);
	}

	private void drawCards(Point start, int rotation) {
		this.translate(start.x, start.y);
		this.rotate(rotation);
		for (int i = 0; i < d.size(); i++)
			for (int j = 0; j < 52; j++)
				this.image(this.loadImage(d.get(i).get(j) + ".gif"),
						d.get(i).get(j).getOffset() * i, 0);
		this.resetMatrix();
	}
	private void drawCards(Point start, int rotation, List<Card> cards) {
		this.translate(start.x, start.y);
		this.rotate(rotation);
		for (int i = 0; i < cards.size(); i++)
				this.image(this.loadImage(cards.get(i).getName() + ".gif"),
						cards.get(i).getOffset() * i, 0);
		this.resetMatrix();
	}
}
