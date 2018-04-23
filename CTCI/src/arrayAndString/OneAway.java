package arrayAndString;

public class OneAway {
	public static void main(String[] args) {
		System.out.println(displacement("pale", "ple") ? "true" : "false");;
	}
	
	static boolean displacement(String str1, String str2) {
		if(Math.abs(str1.length() - str2.length()) > 1) {
			return false;
		}

		String s1 = str1.length() < str2.length() ? str1 : str2;
		String s2 = str1.length() < str2.length() ? str2 : str1;
		boolean foundDifference = false;
		int i = 0, j = 0;
		while(i < s1.length() && j < s2.length()) {
			if(s1.charAt(i) != s2.charAt(j)) {
				if(foundDifference) return false;
				foundDifference = true;
				
				if(s1.length() == s2.length())
					i++;
			} else
				i++;
			j++;
		}
		return true;
	}
}