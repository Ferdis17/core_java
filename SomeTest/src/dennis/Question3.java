package dennis;

public class Question3 {

	public static void main(String[] args) {
		System.out.println(closestFibonacci(12));
		System.out.println(closestFibonacci(33));

	}	
	static int closestFibonacci(int n){
	    int firstNumber = 1;
	    int secondNumber = 1;
	    int result = 1;
	    int next = firstNumber + secondNumber;
	    while ( next < n ){
	        firstNumber = secondNumber;
	        secondNumber = next;

	        next = firstNumber + secondNumber;

	        result = next-firstNumber;
	    }
	    return result;
	}
}
