package recursion;

public class SelectionSort {

	public static void main(String[] args) {
		double [] list = {0.8,8,9,7,4,5,2};
		sort(list);
		for(int i = 0; i < list.length; i++)
		System.out.println(list[i]);

	}
	public static void sort(double [] list) {
		
		sort(list,0,list.length-1);
		
	}
	private static void sort(double[] list, int low, int high) {
		
		if(low < high) {
			int indexMin = low;
			double min = list[low];
			for(int i = low + 1; i <= high; i++) {
				if(list[i] < min) {
					min = list[i];
					indexMin = i;
				}
			}
			list[indexMin] =  list[low];
			list[low] = min;
			sort(list, low+1, high);
			
		}
		
		
	}

}
