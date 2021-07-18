package problems;

public class FrogsCroaking {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int[] count = new int[5];
        int frogs = 0, max_frogs = 0;

        for (int i = 0; i < croakOfFrogs.length() - 1; i++) {
            char c = croakOfFrogs.charAt(i);
            int n = "croak".indexOf(c);
            ++count[n];

            if(n == 0) {
                max_frogs = Math.max(max_frogs, ++frogs);
            } else if(--count[n - 1] < 0) {
                return -1;
            } else if(n == 4) {
                --frogs;
            }
        }

        return frogs == 0 ? max_frogs : -1;
    }
}
