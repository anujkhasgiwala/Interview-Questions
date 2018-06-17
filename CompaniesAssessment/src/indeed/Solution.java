package indeed;

import java.util.Scanner;

/*
2
3 4
2
0 0 255
1 2 255
5 6
4
1 0 10
2 2 9
2 3 5
4 2 9
*/

public class Solution {
    
    static Scanner readInput = new Scanner(System.in);
    
    public static void main(String args[] ) throws Exception {
        int numberOfSheets = readInput.nextInt();
        for(int i = 0; i < numberOfSheets; i++) {
            readInputs();
        }
    }

    static void readInputs() {   
        int row = Integer.parseInt(readInput.next());
        int col = Integer.parseInt(readInput.next());
        int numberOfDots = readInput.nextInt();
        int[][] dotValues = new int[numberOfDots][3];
        for (int[] dotValue:dotValues){
            dotValue[0] = Integer.parseInt(readInput.next());
            dotValue[1] = Integer.parseInt(readInput.next());
            dotValue[2] = Integer.parseInt(readInput.next());
        }
        int totalInk = calcTotalInk(row, col, dotValues);
        System.out.println(totalInk);
    }
    
    public static int calcTotalInk(int row, int col, int[][] dots) {
        int[][] matrix = new int[row][col];
        for (int[] dot : dots) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    int xInk = (i > dot[0]) ? (i - dot[0]) : (dot[0] - i);
                    int yInk = (j > dot[1]) ? (j - dot[1]) : (dot[1] - j);
                    int totalInk = dot[2] - xInk - yInk;
                    if (matrix[i][j] < totalInk) {
                        matrix[i][j] = totalInk;
                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}