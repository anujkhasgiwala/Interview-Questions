package problems;

public class StringReverse {
	public String reverseString(String s) {
        StringBuilder reverseString = new StringBuilder(s).reverse();
        return reverseString.toString();
    }
}
