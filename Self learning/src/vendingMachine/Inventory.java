package vendingMachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory<T> {
	Map<T, Integer> inventory;
	
	public Inventory() {
		inventory = new HashMap<T, Integer>();
	}
	
	//crud methods to manage Inventory 
}
