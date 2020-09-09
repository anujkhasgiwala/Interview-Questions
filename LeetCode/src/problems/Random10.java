package problems;

import java.util.Random;

public class Random10 {
    public int rand10() {
        int number = 7 * (rand7() - 1) + (rand7() - 1);
        return number % 10 + 1;
    }

    public int rand7() {
        return new Random().nextInt(7);
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 2; i ++)
            System.out.println(new Random10().rand10());
    }
}
