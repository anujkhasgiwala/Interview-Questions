package problems;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	Set<Integer> unique = new HashSet<Integer>();
	
	public boolean containsDuplicate(int[] nums) {
       for (int num : nums) {
    	   if(unique.contains(num))
    		   return true;
    	   else
    		   unique.add(num);
       }
       
       return false;
    }
}
