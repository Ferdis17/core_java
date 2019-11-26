package dennis;

public class Question2 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println(isMercurial(new int[] { 1, 2, 10, 3, 15, 1, 2, 2 }));
			System.out.println(isMercurial(new int[] { 5, 2, 10, 3, 15, 1, 2, 2 }));
			System.out.println(isMercurial(new int[] { 1, 2, 10, 3, 15, 16, 2, 2 }));
			System.out.println(isMercurial(new int[] { 3, 2, 18, 1, 0, 3, -11, 1, 3 }));
			System.out.println(isMercurial(new int[] { 2, 3, 1, 1, 18 }));
			System.out.println(isMercurial(new int[] { 8, 2, 1, 1, 18, 3, 5 }));
			System.out.println(isMercurial(new int[] { 3, 3, 3, 3, 3, 3 }));
			System.out.println(isMercurial(new int[] { 1 }));
			System.out.println(isMercurial(new int[] {}));

		}

		public static int isMercurial(int[] a) {
			
			boolean leftPosition = false;
			boolean rightPositions = false;
			int pointerOf3 = -1;
			
			for (int i = 0; i < a.length; i++) {

				if (a[i] == 3) {
					pointerOf3 = i;
					int j = pointerOf3 - 1;
					while (j >= 0) {
						if (a[j] == 1) {
							leftPosition = true;
							break;
						}
						j--;
					}
					int k = pointerOf3 + 1;
					while (k < a.length) {
						if (a[k] == 1) {
							rightPositions = true;
							break;
						}
						k++;
					}
					if (rightPositions && leftPosition) {
						return 0;
					}
				}
			}
			return 1;
		}
	}
