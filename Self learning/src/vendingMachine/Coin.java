package vendingMachine;

public enum Coin {
	PENNY(1),
	NICKEL(5),
	DIME(10),
	QUARTER(25);

	int denomination;
	
	Coin(int value) {
		denomination = value;
	}

	public int getDenomination() {
		return denomination;
	}
}