package selflearning;

public class MergeSort {
    public void sort(int arr[], int l, int r) {
        if(l < r) {
            int mid = (l + r) / 2;
            sort(arr, l, mid);
            sort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }

    private void merge(int arr[], int l, int mid, int r) {
        int size1 = mid - l + 1, size2 = r - mid;
        int left[] = new int[size1], right[] = new int[size2];
        for(int i = 0; i < size1; i++)
            left[i] = arr[l + i];
        for(int j = 0; j < size2; j++)
            right[j] = arr[r + j + 1];

        int i = 0, j = 0, k = l;
        while(i < size1 && j < size2) {
            if(left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < size1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < size2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
