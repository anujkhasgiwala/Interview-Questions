package selflearning;

import java.util.Arrays;

public class TripletWithoutExtraSpace {
	void findTriplet(int arr[], int k) {
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			int l = i + 1, r = arr.length - 1;
			while(l < r) {
				int sum = arr[i] + arr[l] + arr[r];
				if(sum == k)
					System.out.println("triplet found");
				else if (sum < k)
					l++;
				else
					r--;
			}
		}
	}
}
