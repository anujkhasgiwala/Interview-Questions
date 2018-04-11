package Problems;

public class P6 {

	public static void main(String[] args) {
		int sumOfSquare=0,squareOfSum=0;
		for(int i=1;i<=100;i++){
			squareOfSum+=i;
			sumOfSquare+=(i*i);
		}
		System.out.println(Math.abs((squareOfSum*squareOfSum)-sumOfSquare));
	}
}
