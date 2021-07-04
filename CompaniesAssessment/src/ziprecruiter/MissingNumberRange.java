package ziprecruiter;

import java.util.ArrayList;
import java.util.List;

/*
Given a sorted and unique (no duplicate elements) array of integers `array`. Find all missing gaps in that array between a "lower" and an "upper".

You can assume that all integers in `array` are in the [lower, upper] interval (it is possible that the array is empty).

Examples:
- array [0,1,4,52,81] with lower -5, upper 100, then return:["-5:-1","2:3","5:51","53:80","82:100"]
- array [] with lower 1, upper 6, then return ["1:6"]
- array [] with lower 1, upper 1, then return ["1"]
- array [-5] with lower -5, upper -5, then return []

 */
public class MissingNumberRange {
    public static void main(String[] args) {
        int array[] = {-5};
        List<String> list = findMissingGaps(array, -5, -5);
        for(String s : list) {
            System.out.println(s);
        }
    }

    public static List<String> findMissingGaps(int array[], int lower, int upper) {
        String gap = "";
        List<String> missingGap = new ArrayList<>();

        // to avoid iteration when array is empty
        if(array.length == 0) {
            if(lower == upper) {
                gap = String.valueOf(lower);
            } else {
                gap += lower + ":" + upper;
            }
            missingGap.add(gap);
            return missingGap;
        }

        for(int i = 0; i < array.length; i++) {
            if(array[i] - lower > 1) {
                int upperValue = array[i] - 1;
                gap += lower + ":" + upperValue;
            }
            lower = array[i] + 1;

            if(!gap.isEmpty()) {
                missingGap.add(gap);
            }
            gap = "";
        }

        gap += lower + ":" + upper;
        missingGap.add(gap);

        return missingGap;
    }
}
