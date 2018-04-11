package Random;

public class Palindrome {
	public static void main(String[] args) {
		int num = 12321;
		int n = num;

		int revert = 0;
		while(n!=0) {
			revert = revert * 10;
			revert+= n % 10;
			n /= 10;
		}
		if(revert == num){
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}