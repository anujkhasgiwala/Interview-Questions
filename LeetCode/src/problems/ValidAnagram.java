package problems;

public class ValidAnagram {
	public static void main(String args[]) {
		isAnagram("anagram", "nagaram");
	}

	static boolean isAnagram(String s, String t) {
		if(s.length() != t.length())
			return false;

		boolean flag = false;
		if(t.indexOf(s) <= 1)
			return false;
		else
			return true;
        /*for(int i = 0; i < s.length(); i++) {
        	
        }*/        	
    }
}
