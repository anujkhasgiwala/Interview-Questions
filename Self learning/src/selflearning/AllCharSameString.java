package selflearning;

public class AllCharSameString {
    static boolean allSame(String str) {
        int l = 0, r = str.length() - 1;
        char first = str.charAt(0);
        boolean same = false;
        while(l <= r) {
            if(str.charAt(l) == str.charAt(r) && str.charAt(r) == first && str.charAt(l) == first)
                same = true;
            else
                same = false;
            l++;
            r--;
        }

        return same;
    }

    public static void main(String[] args) {
        AllCharSameString.allSame("geeks");
    }
}
