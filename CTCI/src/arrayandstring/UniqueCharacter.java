package arrayandstring;

public class UniqueCharacter {

	public static void main(String[] args) {
		isUnique("abcdab");
	}
	
	static boolean isUnique(String str) {
		for(int i = 0; i< str.length(); i++) {
			for(int j=1; j<str.length(); j++)
			if(str.charAt(i) == str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}