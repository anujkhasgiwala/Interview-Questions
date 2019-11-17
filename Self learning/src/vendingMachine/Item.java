package vendingMachine;

public enum Item {
	COKE(25),
	PEPSI(35),
	SODA(45);
	
	private String name;
	
	private int price;
	
	private Item(int cost) {
		price = cost;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}
