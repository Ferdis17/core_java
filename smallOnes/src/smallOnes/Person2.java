package smallOnes;

public class Person2 {

	public static char randomChar(char a, char b) {
	
		return (char)(a + Math.random()*(b - a + 1));
	}
	public static void main(String args[]) {
		
		System.out.println(randomChar('0','9'));
	}
}
