package quickfind;

public class QuickFindUF {
	
	private int[] id;
	
	public QuickFindUF(int N) {
		id = new int[N];
		
		for (int i = 0; i<N; i++) {
			id[i] = i;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
