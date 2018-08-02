package fibonacci;
/* the purpose of this improvement is to cut the time complixity of recursion which is exponential.
It becomes linear without recursion. Which is tremndous improvement.*/
import java.util.Scanner;

public class FiboImproved {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter and index for the Fibonacci number: ");
		int index = input.nextInt();
		
		System.out.println("Fibonnacci number at index " +index+ " is " + fib(index));

	}

	private static long fib(long n) {
		long f0 = 0; // for fib(0)
		long f1 = 1; // for fib(1)
		long f2 = 1; // for fib(2)
		
		if(n == 0) 
			return f0;
		else if(n ==1) 
			return f1;
		else if(n == 2) 
			return f2;
		
		for(int i = 3; i<=n; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f0 + f1;
		}
		return f2;
	}

}
