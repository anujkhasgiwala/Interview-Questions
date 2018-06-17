package lucid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LongestSubsequence {
	static List<Integer> visited = new ArrayList<Integer>();
	static int numRows = 0, numCols = 0;
	
	static int longestSequence(int grid[][]){
		dynamicProgramming(grid, 0, 0);
		return visited.size();
	}
	
	static void dynamicProgramming(int grid[][], int row, int col) {
		if((row - 1) >= 0 && (col - 1) >= 0) {
			if(Math.abs(grid[row][col] - grid[row - 1][col]) > 3 && !visited.contains((row - 1) * numCols + (col))) {
				visited.add((row - 1) * numCols + (col));
				dynamicProgramming(grid, row - 1, col);
			} else if(Math.abs(grid[row][col] - grid[row][col-1]) > 3 && !visited.contains((row) * numCols + (col - 1))) {
				visited.add((row) * numCols + (col - 1));
				dynamicProgramming(grid, row, col - 1);
			} else if (Math.abs(grid[row][col] - grid[row - 1][col - 1]) > 3 && !visited.contains((row - 1) * numCols + (col - 1))) {
				visited.add((row - 1) * numCols + (col - 1));
				dynamicProgramming(grid, row - 1, col - 1);
			}
		}

		if((row + 1) <= numRows && (col + 1) <= numCols) {
			if(Math.abs(grid[row][col] - grid[row + 1][col]) > 3 && !visited.contains((row + 1) * numCols + (col))) {
				visited.add((row + 1) * numCols + (col));
				dynamicProgramming(grid, row + 1, col);
			} else if(Math.abs(grid[row][col] - grid[row][col + 1]) > 3 && !visited.contains((row) * numCols + (col + 1))) {
				visited.add((row) * numCols + (col + 1));
				dynamicProgramming(grid, row, col + 1);
			} else if (Math.abs(grid[row][col] - grid[row + 1][col + 1]) > 3 && !visited.contains((row + 1) * numCols + (col + 1))) {
				visited.add((row + 1) * numCols + (col + 1));
				dynamicProgramming(grid, row + 1, col + 1);
			}
		}
		
		if((row - 1) >= 0 && (col + 1) <= numCols) {
			if(Math.abs(grid[row][col] - grid[row - 1][col + 1]) > 3  && !visited.contains((row - 1) * numCols + (col + 1))) {
				visited.add((row - 1) * numCols + (col + 1));
				dynamicProgramming(grid, row - 1, col + 1);
			}
		}

		if((row + 1) <= numRows && (col - 1) >= 0) {
			if(Math.abs(grid[row][col] - grid[row + 1][col - 1]) > 3  && !visited.contains((row + 1) * numCols + (col - 1))) {
				visited.add((row + 1) * numCols + (col - 1));
				dynamicProgramming(grid, row + 1, col - 1);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstLine = reader.readLine().split("\\s+");
		numRows = Integer.parseInt(firstLine[0]) - 1;
		numCols = Integer.parseInt(firstLine[1]) - 1;

		int[][] grid = new int[numRows][numCols];

		for (int row = 0; row < numRows; row++) {
		    String[] inputRow = reader.readLine().split("\\s+");

		    for (int col = 0; col < numCols; col++) {
		        grid[row][col] = Integer.parseInt(inputRow[col]);
		    }
		}
		int length = longestSequence(grid);
		System.out.println(length);
	}
}