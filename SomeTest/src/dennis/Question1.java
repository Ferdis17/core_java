package dennis;

public class Question1 {

	public static void main(String[] args) {
		System.out.println(is121Array(new int[] { 1, 2, 1 }));
		System.out.println(is121Array(new int[] { 1, 1, 2, 2, 2, 1, 1 }));
		System.out.println(is121Array(new int[] { 1, 1, 2, 2, 2, 1, 1, 1 }));
		System.out.println(is121Array(new int[] { 1, 1, 2, 1, 2, 1, 1 }));
		System.out.println(is121Array(new int[] { 1, 1, 1, 2, 2, 2, 1, 1, 1, 3 }));
		System.out.println(is121Array(new int[] { 1, 1, 1, 1, 1, 1 }));
		System.out.println(is121Array(new int[] { 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1 }));
		System.out.println(is121Array(new int[] { 1, 1, 1, 2, 2, 2, 1, 1, 2, 2 }));
		System.out.println(is121Array(new int[] { 2, 2, 2 }));
	}

	public static int is121Array(int a[]) {
        if (a == null || a.length < 3) {
            return 0;
        }
        
        int j = 0, k = a.length - 1;
        boolean foundOne = false, foundTwo = false;

        while (j < k) {
            if (a[j] == 1 && a[k] == 1) {
                j++;
                k--;
                foundOne = true;
            } else {
                if (!foundOne) {
                    return 0;
                } else if (a[j] == 2) {
                    foundTwo = true;
                    for (int i = j + 1; i < k + 1; i++) {
                        if (a[i] != 2) {
                            return 0;
                        }
                    }
                    return 1;
                }
            }
        }
        if (foundOne && foundTwo || foundOne && j < a.length && a[j] == 2) {
            return 1;
        }
        return 0;
    }

}
