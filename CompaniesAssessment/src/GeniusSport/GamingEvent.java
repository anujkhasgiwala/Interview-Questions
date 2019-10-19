package GeniusSport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



class Result {

    /*
     * Complete the 'getEventsOrder' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING team1
     *  2. STRING team2
     *  3. STRING_ARRAY events1
     *  4. STRING_ARRAY events2
     */

    public static List<String> getEventsOrder(String team1, String team2, List<String> events1, List<String> events2) {
    // Write your code here
        
        List<Event> eventList = new ArrayList<>();

        for (String str : events1) {
            eventList.add(new Event(team1, str));
        }
        for (String str : events2) {
            eventList.add(new Event(team2, str));
        }

        Collections.sort(eventList, new EventComperator());

        List<String> retList = new ArrayList<>();
        for (Event e : eventList) {
            retList.add(e.toString());
        }
        return retList;
    }

    private static class EventComperator implements Comparator<Event> {

        @Override
        public int compare(Event o1, Event o2) {
            int retInt = o1.getTime1() - o2.getTime1();
            if (retInt != 0) {
                return retInt;
            }
            retInt = o1.getTime2() - o2.getTime2();
            if (retInt != 0) {
                return retInt;
            }
            retInt = o1.getEventName().compareTo(o2.getEventName());
            if (retInt != 0) {
                return retInt;
            }
            retInt = o1.getPlayerName().compareTo(o2.getPlayerName());
            if (retInt != 0) {
                return retInt;
            }
            return 0;
        }

    }

    private static class Event {
        private String teamName;
        private EventType eventName;
        private String playerName;
        private int time1;
        private int time2;
        private String player2Name;
        private static List<String> EVENT_TYPES = Arrays.asList(new String[] { "R", "G", "Y", "S" });

        private static enum EventType {
            G(0), Y(1), R(2), S(3);
            private int code;

            private EventType(int i) {
                this.code = 1;
            }
        }

        private static Pattern TIME_PATTERN = Pattern.compile("\\s[0-9]+(\\+[0-9]+){0,1}\\s");

        public Event(String teamName, String event) {
            this.teamName = teamName;
            Matcher m = TIME_PATTERN.matcher(event);
            int timeIndex = m.find() ? m.start() : -1;

            playerName = event.substring(0, timeIndex).trim();
            String timeStr = event.substring(timeIndex + 1, event.indexOf(' ', timeIndex + 1));
            String[] timeArr = timeStr.split("\\+");
            time1 = Integer.parseInt(timeArr[0]);
            time2 = (timeArr.length > 1) ? Integer.parseInt(timeArr[1]) : 0;
            int eventIndex = timeIndex + timeStr.length() + 2;
            eventName = EventType.valueOf("" + event.charAt(eventIndex));
            if (EventType.S.equals(eventName)) {
                player2Name = event.substring(eventIndex + 1).trim();
            }

        }

        public String toString() {
            String str = teamName + " " + playerName + " " + time1 + (time2 > 0 ? "+" + time2 : "") + " " + eventName
                    + (player2Name != null ? " " + player2Name : "");
            return str;
        }

        public String getTeamName() {
            return teamName;
        }

        public EventType getEventName() {
            return eventName;
        }

        public String getPlayerName() {
            return playerName;
        }

        public int getTime1() {
            return time1;
        }

        public int getTime2() {
            return time2;
        }

        public String getPlayer2Name() {
            return player2Name;
        }

        public static List<String> getEVENT_TYPES() {
            return EVENT_TYPES;
        }

        public static Pattern getTIME_PATTERN() {
            return TIME_PATTERN;
        }

    }
    }