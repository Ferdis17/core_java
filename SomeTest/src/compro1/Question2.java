package compro1;

public class Question2 {

	public static void main(String[] args) {
		
		
		System.out.println();
		
	}
	
	public static int is123Array(int [] a) {
        if(a == null || a.length < 3 || a.length % 3 != 0) {
            return 0;
        }
        int k = 0;
        while (3*k + 2 < a.length) {
            if (a[3*k] != 1 || a[3*k + 1] != 2 || a[3*k + 2] != 3 ) {
                return 0;
            }
            k++;
        }
        return 1;
    }

}