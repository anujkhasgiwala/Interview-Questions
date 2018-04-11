package Problems;

public class P4 {
	
	public static void main(String[] args) {
		int no1, no2;
		int[] productDigit = new int[6];
		for(no1 = 999; no1 >= 100; no1--) {
			for(no2 = 999; no2 >= 100; no2--) {
				int product = no1*no2;
				for(int i=5;i>=0;i--) {
					int temp=product%10;
					productDigit[i]=temp;
					product/=10;
				}
				if(productDigit[0]==productDigit[5] && productDigit[2]==productDigit[3] && productDigit[1]==productDigit[4])
					System.out.println(no2*no1);
			}
		}
	}
}