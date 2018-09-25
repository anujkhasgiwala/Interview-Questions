package problems;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacter {
	public static void main(String[] args) {
		firstUniqChar("cc");
	}
	
	public static int firstUniqChar(String s) {
		if(s.length() == 1)
			return 0;

		Map<Character, Integer> unique = new LinkedHashMap<Character, Integer>();
		Set<Character> set = new HashSet<Character>(); 
		
		for(int i = 0; i < s.length(); i++) {
			if(set.contains(s.charAt(i))) {
	        	if(unique.containsKey(s.charAt(i)))
	        		unique.remove(s.charAt(i));
			}
        	else {
        		unique.put(s.charAt(i), i);
        		set.add(s.charAt(i));
        	}
        }
        
        if(unique.size() == 0)
        	return -1;        

        return unique.entrySet().iterator().next().getValue();
    }
}
