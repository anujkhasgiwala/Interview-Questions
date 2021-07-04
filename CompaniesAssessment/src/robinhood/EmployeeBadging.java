package robinhood;

/*
We are working on a security system for a badged-access room in our company's building.

We want to find employees who badged into our secured room unusually often. We have an unordered list of names and entry times over a single day. Access times are given as numbers up to four digits in length using 24-hour time, such as "800" or "2250".

Write a function that finds anyone who badged into the room three or more times in a one-hour period. Your function should return each of the employees who fit that criteria, plus the times that they badged in during the one-hour period. If there are multiple one-hour periods where this was true for an employee, just return the earliest one for that employee.

badge_times = [
  ["Paul",     "1355"],
  ["Jennifer", "1910"],
  ["John",      "835"],
  ["John",      "830"],
  ["Paul",     "1315"],
  ["John",     "1615"],
  ["John",     "1640"],
  ["Paul",     "1405"],
  ["John",      "855"],
  ["John",      "930"],
  ["John",      "915"],
  ["John",      "730"],
  ["John",      "940"],
  ["Jennifer", "1335"],
  ["Jennifer",  "730"],
  ["John",     "1630"],
  ["Jennifer",    "5"]
]

Expected output (in any order)
  John:  830  835  855  915  930
  Paul: 1315 1355 1405

n: length of the badge records array


  */

import java.util.*;

public class EmployeeBadging {
    public static void main(String[] args) {
        String[][] badgeTimes = new String[][] {
                {"Paul",     "1355"},
                {"Jennifer", "1910"},
                {"John",      "835"},
                {"John",      "830"},
                {"Paul",     "1315"},
                {"John",     "1615"},
                {"John",     "1640"},
                {"Paul",     "1405"},
                {"John",      "855"},
                {"John",      "930"},
                {"John",      "915"},
                {"John",      "730"},
                {"John",      "940"},
                {"Jennifer", "1335"},
                {"Jennifer",  "730"},
                {"John",     "1630"},
        };

        Map<String, List<Integer>> map = new EmployeeBadging().getUnusualBadging(badgeTimes);
    }

    private Map<String, List<Integer>> getUnusualBadging(String badgeTimes[][]) {
        // sort array by times
        Arrays.sort(badgeTimes, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                Integer e1 = Integer.valueOf(o1[1]);
                Integer e2 = Integer.valueOf(o2[1]);

                return e1.compareTo(e2);
            }
        });

        // Map for name and list of times in sorted order
        Map<String, List<Integer>> badgeTimeMap = new HashMap<>();
        for(int i = 0; i < badgeTimes.length; i++) {
            List<Integer> times = new ArrayList<>();
            if(badgeTimeMap.containsKey(badgeTimes[i][0])) {
                times = badgeTimeMap.get(badgeTimes[i][0]);
            }

            times.add(Integer.valueOf(badgeTimes[i][1]));
            badgeTimeMap.put(badgeTimes[i][0], times);
        }

        Map<String, List<Integer>> resultTimes = new HashMap();
        for(Map.Entry<String, List<Integer>> entry : badgeTimeMap.entrySet()) {
            List<Integer> times = entry.getValue();
            List<Integer> finalTimes = new ArrayList();

            int countTimes = 0 ;
            for(int i = 0; i < times.size(); i++) {
                finalTimes.add(times.get(i));
                for(int j = i + 1; j < times.size() - 1; j++) {
                    if(countTimes == 3) {
                        resultTimes.put(entry.getKey(), finalTimes);
                        break;
                    }

                    if(times.get(j) - times.get(i) <= 100) {
                        countTimes++;
                        finalTimes.add(times.get(j));
                    }
                }
            }
        }

        return resultTimes;
    }
}
