package pivotArray;

public class PivotSum {
	
	public static void main(String[] args) {
		
		System.out.println(pivotElemt(new int[]{1,4,3,5}, 4));
	}
	
	public static int pivotElemt(int[] nums, int n) {
		
		int rightSum  = 0; // full sum
		int leftSum = 0;
		
		for(int i  = 1; i<nums.length; i++) {
			
			rightSum +=nums[i];
		}
		for(int i = 0, j= 1; j<nums.length; i++, j++) {
			
			rightSum -= nums[j];
			leftSum += nums[i];
			if(rightSum == leftSum) {
				return nums[i+1];
			}
			
		}
		return -1;
	}

}
