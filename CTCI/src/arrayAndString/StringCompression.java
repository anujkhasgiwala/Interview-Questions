package arrayAndString;

public class StringCompression {

	public static void main(String[] args) {
		compression("aabcccccaaa");
	}
	
	static void compression(String str) {
//		int finalLength = countCompression(str);
//		if (finalLength >= str.length()) return str;
		
		StringBuilder compressed= new StringBuilder();
		int countConsecutive = 0;
		for (int i= 0; i < str.length(); i++) {
			countConsecutive++;
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		System.out.println(compressed.toString());
	}
	
	//repeat code
	static int countCompression(String str) {
		int compressedlength = 0;
		int countConsecutive = 0;
		for (int i= 0; i < str.length(); i++) {
			countConsecutive++;
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedlength += 1 + String.valueOf(countConsecutive).length();
				countConsecutive = 0;
			}
		}
		return compressedlength;
	}
}
