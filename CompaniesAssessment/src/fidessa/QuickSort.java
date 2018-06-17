package fidessa;

public class QuickSort {
	public static void quickSort(int[] input, int low, int high) {
		if (input == null || input.length == 0)
			return;

		if (low >= high)
			return;

		int middle = low + (high - low) / 2;
		int pivot = input[middle];

		int i = low, j = high;
		while (i <= j) {
			while (input[i] < pivot) {
				i++;
			}

			while (input[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
				j--;
			}
		}

		if (low < j)
			quickSort(input, low, j);

		if (high > i)
			quickSort(input, i, high);
	}

	static int findMinGates(int[] arrivals, int[] departures, int flights) {
		quickSort(arrivals, 0, arrivals.length-1);
		quickSort(departures, 0, departures.length-1);
		int number_of_gates=1, result=1, i=1, j=0;
		while(i<flights && j<flights){
			if(arrivals[i]<departures[j]){
				number_of_gates++;
				i++;
				if(number_of_gates>result){
					result=number_of_gates;
				}
			}
			else{
				number_of_gates--;
				j++;
			}

		}
		System.out.println(result);
		return result;
	}
}
