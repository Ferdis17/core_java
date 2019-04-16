package comproTest;

public class Question2 {

	public static void main(String[] args) {
		System.out.println(sameNumberOfFactors(-6, 21));
		System.out.println(sameNumberOfFactors(6 ,21));
		System.out.println(sameNumberOfFactors(8,12));
		System.out.println(sameNumberOfFactors(23,97));
		System.out.println(sameNumberOfFactors(0,1));
		System.out.println(sameNumberOfFactors(0,0));

	}
	public static int sameNumberOfFactors(int n1, int n2) {
        if (n1 < 0 || n2 < 0) {
            return -1;
        }
        if (n1 == n2) {
            return 1;
        }
        int n1Factors = 0, n2Factors = 0;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                n1Factors++;
            }
        }

        for (int i = 1; i <= n2; i++) {
            if (n2 % i == 0) {
                n2Factors++;
            }
        }
        return n1Factors == n2Factors ? 1 : 0;
    }

}
