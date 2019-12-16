package fibonacci;

public class FiboRecursion {

	public static void main(String[] args) {
		
		System.out.println(fib(10));
		
	}
	
	public static long fib(long a) {
		if(a == 0) return 0;
		if(a == 1) return 1;
		else
			return fib(a-1) + fib(a-2);
			
		
	}

}
