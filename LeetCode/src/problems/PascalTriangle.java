package problems;

import java.util.*;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> triangle = new ArrayList<List<Integer>>(numRows);
    	List<Integer> values;

    	if(numRows == 0)
    		return triangle;
    	else if(numRows == 1) {
    		values = new ArrayList<Integer>();
    		values.add(1);
    		triangle.add(values);
    		return triangle;
    	} else if(numRows == 2) {
    		values = new ArrayList<Integer>();
    		values.add(1);
    		triangle.add(values);
    		values = new ArrayList<Integer>();
    		values.add(1);
    		values.add(1);
    		triangle.add(values);
    		return triangle;
    	} else {
    		values = new ArrayList<Integer>();
    		values.add(1);
    		triangle.add(values);
    		values = new ArrayList<Integer>();
    		values.add(1);
    		values.add(1);
    		triangle.add(values);
    		for(int i = 3; i <= numRows; i++) {
    			List<Integer> values1 = new ArrayList<Integer>();
    			values1 = triangle.get(i-2);
    			values = new ArrayList<Integer>();
    			values.add(1);
    			for(int j = 0; j <= values1.size() - 2; j++) {
    				values.add(values1.get(j) + values1.get(j+1));
    			}
    			values.add(1);
    			triangle.add(values);
    		}
    	}
    	return triangle;
    }

    public static void main(String[] args) {
		new PascalTriangle().generate(4);
	}
}