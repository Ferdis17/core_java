package aubinBurundi;

public class Question2 {
	
	public static void main(String[] args) {
		System.out.println(isDigitIncreasing(23));

	}

	public static int isDigitIncreasing(int n) {

        for (int i = 1; i < 10; i++) {

            int sum = 0, count = 1;

            while (sum < n) {

                sum += generateIncreasingDigit(i, count++);

            }

            if (sum == n) {

                return 1;

            }

        }

        return 0;
    }
    public static int generateIncreasingDigit(int v, int n) {

        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum = sum * 10 + v;

        }

        return sum;

    }


}
