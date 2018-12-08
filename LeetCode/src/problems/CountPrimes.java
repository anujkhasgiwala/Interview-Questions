package problems;

public class CountPrimes {
    public int countPrimes(int n) {
        if(n == 0 || n == 1)
            return 0;
        int count = 0;
        while(n > 1) {
            if(isPrime(n))
                count++;
        }

        return count;
    }

    public boolean isPrime(int n) {
        int temp;
        for(int i = 2; i <= n/2; i++) {
            temp = n%i;
            if(temp==0) {
                return false;
            }
        }

        return true;
    }
}
