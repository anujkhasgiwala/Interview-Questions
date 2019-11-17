package vendingMachine;

import java.util.List;

public class Machine {
	public int selectItemGetPrice(Item item) {
		return Item.valueOf(item.getName()).getPrice();
	}
	
	public void addMoney(Coin coin) {
		
	}
	
	public List<Coin> refund() {
		return null;
	}
}
