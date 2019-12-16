package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
	public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        List<Integer> topK = new ArrayList<Integer>();
        
        for(int num : nums) {
        	if(frequency.containsKey(num))
        		frequency.put(num, frequency.get(num) + 1);
        	else
        		frequency.put(num, 1);
        }
        List list = new ArrayList(frequency.entrySet());
        
        Collections.sort(list, new SortFrequencyDesc());

        for(int i = 0; i < k; i++) {
        	topK.add(((Map.Entry<Integer, Integer>)list.get(i)).getKey());
        }
        return topK;
    }
	
	public static void main(String[] args) {
		int nums[] = {2,2,1,1,1,3};
		TopKFrequentElements t = new TopKFrequentElements();
		t.topKFrequent(nums, 2);
	}
}

class SortFrequencyDesc implements Comparator<Map.Entry<Integer, Integer>>{
	@Override
    public int compare(Map.Entry<Integer,Integer> e1, Map.Entry<Integer,Integer> e2) {
        return e2.getValue().compareTo(e1.getValue());
    }
}