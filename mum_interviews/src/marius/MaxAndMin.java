package marius;

public class MaxAndMin {

	public static void main(String[] args) {
		int arr[] = {2,9,5,7,10,15};
		System.out.println("min is: "+min(arr));
		System.out.println("max is: "+max(arr));
	}
	
	public static int max(int[]arr) {
		
	int max = 0;
	for(int i = 0; i<arr.length; i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
		return max;
	}
	public static int min(int[]arr) {
		
		int min = arr[0];
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
			return min;
		}

}
