package arrayAndString;

public class UniqueCharacter {

	public static void main(String[] args) {
		isUnique("abcdab");
	}
	
	static boolean isUnique(String str) {
		boolean alphabets[] = new boolean[26];
		for (int i = 0; i < str.length(); i++) {
			int value = str.charAt(i) - 'A';
			if (alphabets[value])
				return false;
			alphabets[value] = true;
		}

		return true;
	}
}