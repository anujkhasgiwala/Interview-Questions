package selflearning;

import java.util.HashSet;

public class TripletWithExtraSpace {
	void findTriplet(int arr[], int k) {
		for(int i = 0; i < arr.length - 2; i++) {
			HashSet<Integer> s = new HashSet<>();
			for(int j = i + 1; j < arr.length; j++) {
				int difference = k - arr[i] + arr[j];
				if(s.contains(difference))
					System.out.println("Triplet found");
				else
					s.add(arr[j]);
			}
		}
	}
}
