package selflearning;

public class StringPermute {
    public void permute(String str, int l, int r) {
        if(l == r)
            System.out.print(str);

        for(int i = l; i < r; i++) {
            str = swap(str, l, i);
            permute(str, l + 1, r);
            str = swap(str, l, i);
        }
    }

    private String swap(String str, int i, int j) {
        char chars[] = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }
}
