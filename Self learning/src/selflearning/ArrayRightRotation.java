package selflearning;

public class ArrayRightRotation {
    public void leftRotate(int arr[], int d) {
        if (d == 0)
            return;
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, d);
        reverseArray(arr, d, arr.length - 1);        
    }

    private void reverseArray(int arr[], int l, int r) {
        int temp;
        while(l <= r) {
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
