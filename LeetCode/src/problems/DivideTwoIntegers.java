package problems;

public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
            return Integer.MAX_VALUE;
        }

        boolean isOneNegative = false;
        int quotient = 0;

        if((dividend < 0 && divisor >= 0) || (dividend >= 0 && divisor < 0)) {
            isOneNegative = true;
        }

        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);

        while(ldividend >= ldivisor) {
            ldividend -= ldivisor;
            quotient++;
        }

        if(isOneNegative) {
            return quotient * -1;
        }

        return quotient;
    }

    public static void main(String[] args) {
        divide(-2147483648,-1);
    }
}
