package problems;

public class HappyNumbers {
	public static void main(String[] args) {
		isHappy(19);
	}

	static public boolean isHappy(int n) {
        int a = n/10,b=n%10, sum = 0;
        
        while(sum != 1) {
        	//
        	sum = a*a + b*b;
        	a = sum/10;
        	b = sum%10;
        	
        	if(sum == 1) {
        		return true;
        		
        	}
        }
        
        return false;
    }
}
