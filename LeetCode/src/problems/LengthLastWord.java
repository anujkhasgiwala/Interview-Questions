package problems;

public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().length() == 0) {
            return 0;
        }

        String lastWord = s.split(" ")[s.split(" ").length - 1];
        if(!lastWord.matches("^[a-zA-Z]*$")) {
            return 0;
        }

        return lastWord.length();
    }

    public static void main(String[] args) {
        System.out.print(new LengthLastWord().lengthOfLastWord("Hello World"));
    }
}
