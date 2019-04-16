package comproTest;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isMercurial(new int[] {1, 2, 10, 3, 15, 1, 2,2} ));
System.out.println(isMercurial(new int[] {5, 2, 10, 3, 15, 1, 2,
		2} ));
System.out.println(isMercurial(new int[] {1, 2, 10, 3, 15, 16, 2,
		2} ));
System.out.println(isMercurial(new int[] {3, 2, 18, 1, 0, 3, -
		11, 1, 3} ));
System.out.println(isMercurial(new int[] {2, 3, 1, 1, 18} ));
System.out.println(isMercurial(new int[] {8, 2, 1, 1, 18, 3, 5} ));
System.out.println(isMercurial(new int[] {3, 3, 3, 3, 3, 3} ));
System.out.println(isMercurial(new int[] {1} ));
System.out.println(isMercurial(new int[] {} ));

	}

    public static int isMercurial(int[] a) {
        int indexOf3 = -1;
        boolean rightOne = false;
        boolean leftOne = false;
        for (int i = 0; i < a.length; i++) {
            
            if (a[i] == 3) {
            	indexOf3 = i;
            	int j = indexOf3 - 1;
            	while(j>=0) {
            		if (a[j] == 1) {
                    	leftOne = true;
                        break;
                    }
            	 	j--;
            	}
            	int k = indexOf3 + 1;
            	while(k < a.length) {
            		if (a[k] == 1) {
                    	rightOne = true;
                        break;
                    }
            		k++;
            	}

                if (rightOne && leftOne) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
