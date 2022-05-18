package problems;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom {
    private static class MeetingTime {
        int start, end;
    }

    private static boolean canAttend(MeetingTime[] times) {
        Arrays.sort(times, new Comparator<MeetingTime>() {
            @Override
            public int compare(MeetingTime o1, MeetingTime o2) {
                return o1.start - o2.start;
            }
        });

        for (int i = 0; i < times.length - 1; i++) {
            if(times[i].end > times[i+1].start) {
                return false;
            }
        }

        return true;
    }
}
