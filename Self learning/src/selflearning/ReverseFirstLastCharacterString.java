package selflearning;

public class ReverseFirstLastCharacterString {
    public static void main(String[] args) {
        reverseFirstLast("geeks for geeks");
    }

    static private void reverseFirstLast(String str) {
        if(str == null || str.isEmpty())
            return;

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            int last = words[i].length() - 1;
            char wordChar[] = words[i].toCharArray();
            char temp = wordChar[0];
            wordChar[0] = wordChar[last];
            wordChar[last] = temp;
            words[i] = new String(wordChar);
        }

        System.out.print(String.join(" ",words));
    }
}
