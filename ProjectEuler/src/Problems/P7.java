package Problems;

public class P7 {
	public static void main(String[] args) {
		int count = 0;
		for(int i=2;i<2147483647;i++){
			if(isPrime(i)) {
				count++;
				if(count==10001) {
					System.out.println(i);
					break;
				}
			}
		}
	}
	
	static boolean isPrime(int n) {
		for(int j=2;j<n;j++){
			if(n%j==0) {
				return false;
			}
		}
		return true;
	}
}
