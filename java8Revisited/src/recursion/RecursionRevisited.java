package recursion;

public class RecursionRevisited {

	public static void main(String[] args) {
		

	}
	
	public int sumOfn(int n) {
		
		if(n == 0 || n == 1 ) {
			return n;
		}
		return (n-1) + sumOfn(n);
	}

}
