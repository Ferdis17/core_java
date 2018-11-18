package compro1;

public class Question1 {

	public static void main(String[] args) {
		
		System.out.println(equvalentArrays(new int[] {0, 1, 2}, new int[] {2, 0, 1} ));
		System.out.println(equvalentArrays(new int[] {0, 1, 2, 1}, new int[] {2, 0, 1} ));
//		System.out.println(equvalentArrays(new int[] {}, new int[] {} ));
//		System.out.println(equvalentArrays(new int[] {}, new int[] {} ));
//		System.out.println(equvalentArrays(new int[] {}, new int[] {} ));
//		System.out.println(equvalentArrays(new int[] {}, new int[] {} ));
//		System.out.println(equvalentArrays(new int[] {}, new int[] {} ));
//		System.out.println(equvalentArrays(new int[] {}, new int[] {} ));
//		System.out.println(equvalentArrays(new int[] {}, new int[] {} ));
//		System.out.println(equvalentArrays(new int[] {}, new int[] {} ));
//		System.out.println(equvalentArrays(new int[] {}, new int[] {} ));

	}
	public static int equvalentArrays(int[] a1, int[] a2)
	{
		int equivalent=1;
		
		for (int i = 0; i < a1.length&& equivalent==1; i++) {
			int thereExits=0;
			for (int j = 0; j < a2.length&&thereExits==0; j++) {
				if(a1[i]==a2[j])
					thereExits=1;
				
			}
			if(thereExits==0)
				equivalent=0;			
			
		}
		for (int i = 0; i < a2.length&& equivalent==1; i++) {
			int thereExits=0;
			for (int j = 0; j < a1.length&&thereExits==0; j++) {
				if(a2[i]==a1[j])
					thereExits=1;
				
			}
			if(thereExits==0)
				equivalent=0;			
			
		}
		return equivalent;
	}


}
