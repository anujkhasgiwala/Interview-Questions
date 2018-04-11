package Test;

public class A {
	public static void main(String args[]) {
		int arr[] = {3,4,5,1,2};
		reverse(arr);
		
		for (int i : arr) {
			System.out.print(i);
		}
	}
	
	static void reverse(int arr[]){
		int breakpoint = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[i+1]) {
				breakpoint = i+1;
				break;
			}
		}
		System.out.println(breakpoint);
		
		revereseArray(arr, 0, breakpoint-1);
		revereseArray(arr, breakpoint, arr.length-1);
		revereseArray(arr, 0, arr.length-1);
	}
	
	static void revereseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
