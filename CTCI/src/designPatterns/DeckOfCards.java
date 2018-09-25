package designPatterns;

import java.util.*;

enum Suit {
	Heart(0), Spade(1), Club(2), Diamond(3);

	int value;

	private Suit(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}

class Deck<T extends Card> {
	private ArrayList<T> cards;
	private int dealtlndex = 0;

	public void setDeckOfCards(ArrayList<T> deckOfCards) {

	}

	public void shuffle() {

	}

	public int remainingCards() {
		return cards.size() - dealtlndex;
	}

	public T[] dealHand(int number) {
		return null;
	}

	public T dealCard() {
		return null;
	}
}

abstract class Card {
	private boolean available = true;
	protected int faceValue;
	protected Suit suit;

	public Card(int c, Suit s) {
		faceValue = c;
		suit = s;
	}

	public abstract int value();

	public Suit suit() {
		return suit;
	}

	public boolean isAvailable() {
		return available;
	}

	public void markUnavailable() {
		available = false;
	}

	public void markAvailable() {
		available = true;
	}
}

public class DeckOfCards {
	public static void main(String[] args) {

	}
}
