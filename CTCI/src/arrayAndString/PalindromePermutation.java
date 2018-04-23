package arrayAndString;

public class PalindromePermutation {
	public static void main(String[] args) {
		
	}
	
	boolean isPalindromePermutation(String sentence){
		int oddCount = 0;
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for(char c : sentence.toCharArray()) {
			int x = getCharNumber(c);
			if(x != -1) {
				table[x]++;
				if(table[x] % 2 == 1) 
					oddCount++;
				else
					oddCount --;
			}
		}
		return oddCount <= 1;
	}
	
	int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if(a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}
	
	boolean isPalindromePermutation1(String sentence){
		int bitVector = createBitVector(sentence);
		return bitVector == 0 || checkExactlyOneBitSet(bitVector);
	}
	
	int createBitVector(String sentence) {
		int bitVector = 0;
		for (char c : sentence.toCharArray()) {
			int x = getCharNumber(c);
			bitVector = toggle(bitVector, x);
		}
		return bitVector;
	}
	
	int toggle(int bitVector, int index) {
		if(index < 0) return bitVector;
		
		int mask = 1 << index;
		if((bitVector & mask) == 0)
			bitVector|= mask;
		else
			bitVector&= ~mask;
		return bitVector;
	}
	
	boolean checkExactlyOneBitSet(int bitVector) {
		return (bitVector & (bitVector - 1)) == 0;
	}
}
