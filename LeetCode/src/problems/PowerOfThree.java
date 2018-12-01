package problems;

public class PowerOfThree {
	public static void main(String[] args) {
		isPowerOfThree(27);
	}

	static public boolean isPowerOfThree(int n) {
		return n > 0 && Math.pow(3, 19) % n == 0;
    }
}
