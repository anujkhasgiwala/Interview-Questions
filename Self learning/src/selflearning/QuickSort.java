package selflearning;

public class QuickSort {
    public void sort(int arr[], int l, int r) {
        if(l < r) {
            int pivot = partition(arr, l, r);

            sort(arr, l, pivot - 1);
            sort(arr, pivot + 1, r);
        }
    }

    private int partition(int arr[], int l, int r) {
        int pivot = arr[r], i = l - 1;
        for (int j = l; j < r; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i;
    }
}
