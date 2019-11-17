package selflearning;

public class SearchInRotatedArray {
	public int search(int arr[], int l, int r, int elem) {
		if(l > r)
			return -1;
		
		int mid = (l + r) / 2;
		
		if(arr[mid] == elem)
			return mid;
		
		if(arr[l] < arr[mid]) {
			if(arr[l] <= elem && elem <= arr[mid])
				return search(arr, l, mid - 1, elem);
			return search(arr, mid + 1, r, elem);
		}
		
		if(arr[mid] <= elem && elem <= arr[r])
				search(arr, mid + 1, r, elem);
		
		return search(arr, l, mid - 1, elem);
	}
}
