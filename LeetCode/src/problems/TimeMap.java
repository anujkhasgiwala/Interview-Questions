package problems;

import java.util.*;

class TimeMap {
    Map<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        map = new HashMap<String, TreeMap<Integer,String>>();
    }
    
    public void set(String key, String value, int timestamp) {
    	if (!map.containsKey(key))
            map.put(key, new TreeMap<Integer, String>());

        map.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
    	if (!map.containsKey(key)) return "";
    	
        Integer temp = map.get(key).floorKey(timestamp);
        return temp != null ? map.get(key).get(temp): "";
    }
}
