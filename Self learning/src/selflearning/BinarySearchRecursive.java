package selflearning;

public class BinarySearchRecursive {
	int binarySearch(int arr[], int l, int r, int elem) {
		if (l <= r) {
			int mid = (l + r) / 2;
			
			if(arr[mid] == elem)
				return mid;
			
			if(elem < arr[mid])
				return binarySearch(arr, l, mid - 1, elem);
			
			return binarySearch(arr, mid + 1, r, elem);
		}
		return -1;
	}
}
