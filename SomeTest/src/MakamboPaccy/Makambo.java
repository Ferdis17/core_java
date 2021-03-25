package MakamboPaccy;

public class Makambo {
	
	public static int computeWeightedSum(int[ ] a) {
		
		int weightedSum= 0;
		
		if (a == null || a.length == 0) {
			return 0;
		}
		int evenSum = 0;
		int oddSum = 0;
		for(int i : a) {
			
			if(i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		weightedSum = 2*(evenSum) + 3*(oddSum);
		
		return weightedSum;
	}
	
	public static void main(String[] args) {
		System.out.println(computeWeightedSum(new int[] {1, 2, 3, 4, 5}));
		System.out.println(computeWeightedSum(new int[] {1, 3, 5}));
		System.out.println(computeWeightedSum(new int[] {2, 4, 6}));
		System.out.println(computeWeightedSum(new int[] {1}));
		System.out.println(computeWeightedSum(new int[] {2}));
		System.out.println(computeWeightedSum(new int[] {0, 0, 0, 0, 0}));

	}

}
