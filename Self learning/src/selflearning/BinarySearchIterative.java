package selflearning;

public class BinarySearchIterative {
	int binarySearch(int arr[], int elem, int l, int r) {
		while(l <= r) {
			int mid = (l + r) / 2;
			if(arr[mid] == elem)
				return mid;
			if(elem < arr[mid])
				r = mid - 1;
			else
				l = mid + 1;
		}
		return -1;
	}
}
