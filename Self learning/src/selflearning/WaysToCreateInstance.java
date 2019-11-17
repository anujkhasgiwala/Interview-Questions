package selflearning;

import java.lang.reflect.InvocationTargetException;

public class WaysToCreateInstance {
	public static void main(String[] args) {
		WaysToCreateInstance w1 = new WaysToCreateInstance();
		try {
			WaysToCreateInstance w2 = WaysToCreateInstance.class.newInstance();
			WaysToCreateInstance w3 = (WaysToCreateInstance) Class.forName("WaysToCreateInstance").newInstance();
			WaysToCreateInstance w4 = (WaysToCreateInstance) w1.clone();
			WaysToCreateInstance w5 = WaysToCreateInstance.class.getDeclaredConstructor().newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}		
	}
}
