package problem;

import java.util.Scanner;

public class LongestPath {

	static int longestIncreasingPath(int[][] matrix) {
		if (matrix.length == 0 || matrix[0].length == 0) {
			return 0;
		}
		
		int[][] distance = new int[matrix.length][matrix[0].length];
		int max = 1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				int res = dfs(matrix, i, j, distance, Integer.MIN_VALUE);
				if (res >= max) {
					max = res;
				}
			}
		}
		return max;
	}

	static int dfs(int[][] matrix, int i, int j, int[][] distance, int prev) {
		if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[i].length) {
			return 0;
		}

		if (matrix[i][j] <= prev) {
			return 0;
		}

		if (distance[i][j] != 0) {
			return distance[i][j];
		}

		int v1 = dfs(matrix, i - 1, j, distance, matrix[i][j]); //top
		int v2 = dfs(matrix, i, j - 1, distance, matrix[i][j]); //left
		int v3 = dfs(matrix, i + 1, j, distance, matrix[i][j]); //down
		int v4 = dfs(matrix, i, j + 1, distance, matrix[i][j]); //right
		int v5 = dfs(matrix, i - 1, j - 1, distance, matrix[i][j]); //top left
		int v6 = dfs(matrix, i + 1, j - 1, distance, matrix[i][j]); //bottom left
		int v7 = dfs(matrix, i + 1, j + 1, distance, matrix[i][j]); //bottom right
		int v8 = dfs(matrix, i - 1 , j + 1, distance, matrix[i][j]); //top right

		distance[i][j] = 1 + Math.max(Math.max(Math.max(v1, v2), Math.max(v3, v4)), Math.max(Math.max(v5, v6), Math.max(v7, v8)));
		return distance[i][j];
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int numOfRows=s.nextInt(),numOfCols=s.nextInt();
		int[][] input=new int[numOfRows][numOfCols];
		
		for(int i=0;i<numOfRows;i++){
			for (int j = 0; j < numOfCols; j++) {
				input[i][j]= s.nextInt();
			}
		}
		System.out.println("Size of non decreasing sequence is: " + longestIncreasingPath(input));
	}
}