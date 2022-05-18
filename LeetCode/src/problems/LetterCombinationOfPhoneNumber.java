package problems;

import java.util.*;

public class LetterCombinationOfPhoneNumber {

    private final static Map<String, List<String>> numberLetterMap = new HashMap();
    static {
        numberLetterMap.put("2", Arrays.asList("a", "b", "c"));
        numberLetterMap.put("3", Arrays.asList("d", "e", "f"));
        numberLetterMap.put("4", Arrays.asList("g", "h", "i"));
        numberLetterMap.put("5", Arrays.asList("j", "k", "l"));
        numberLetterMap.put("6", Arrays.asList("m", "n", "o"));
        numberLetterMap.put("7", Arrays.asList("p", "q", "r", "s"));
        numberLetterMap.put("8", Arrays.asList("t", "u", "v"));
        numberLetterMap.put("9", Arrays.asList("w", "x", "y", "z"));
    }

    public List<String> letterCombinations(String digits) {
        LinkedList<String> combinations = new LinkedList();

        if(digits == null || digits.length() == 0) {
            return combinations;
        }

        if(!digits.matches("^[2-9]{1,4}")) {
            return combinations;
        }

        combinations.addAll(numberLetterMap.get(String.valueOf(digits.charAt(0))));

        while(combinations.peek().length() != digits.length()) {
            String prev = combinations.pop();
            for(String alpha : numberLetterMap.get(String.valueOf(digits.charAt(prev.length()) - '0'))) {
                combinations.addLast(prev + alpha);
            }
        }

        return combinations;
    }

    public static void main(String[] args) {
        new LetterCombinationOfPhoneNumber().letterCombinations("2");
    }
}
