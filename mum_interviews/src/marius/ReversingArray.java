package marius;

public class ReversingArray {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60,70};
		
		System.out.println("Before: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
		System.out.println("After: ");
		reverse(a,a.length);
	}
	
	public static void reverse(int [] arr, int n) {
		
		int newArr[] =  new int[n];
		int j = n;
		for(int i = 0; i < n; i++) {
			newArr[j-1] = arr[i];
			j=j-1;
		}
		for(int i=0; i<newArr.length; i++) {
			System.out.print(newArr[i]+ " ");
		}
	}

}
