package smallOnes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class WordSplit {

	public static void main(String[] args) {
		System.out.println(wordSplit(new String[] {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"}));
		System.out.println(minimumWindowSubString(new String[] {"ahffaksfajeeubsne", "jefaa"}));
	}
	
	public static List<String> wordSplit(String[] strArr) {
	    // code goes here 
	    String charSeq = strArr[0];
	    List<String> list =  new ArrayList<>(Arrays.asList(strArr[1].split(",")));
	    List<String> result = new ArrayList<>();

	    for(int i = 0; i < charSeq.length(); i++){
	      for(int j = i + 1; j < charSeq.length(); j++){
	        String sub = charSeq.substring(i, j);
	        if(list.contains(sub))
	          result.add(sub);
	      }
	    }

	    return result;
	  }
	
	public static String minimumWindowSubString(String [] strArr) {

		if (strArr == null || strArr.length == 0 || strArr.length != 2 || strArr[0].length() < strArr[1].length()) return null;

		if (strArr[1].length() < 1) return strArr[0];

		LinkedList<Integer> locations = new LinkedList<>();

		LinkedList<Character> theT = new LinkedList<>();

		HashMap<Character, Integer> keyMap = new HashMap<>();

		int[] minWindow = new int[]{0, 0};

		for (char c : strArr[1].toCharArray()) {

			keyMap.put(c, keyMap.getOrDefault(c, 0) + 1);

		}

		int count = strArr[1].length();

		for (int i = 0; i < strArr[0].length(); i++) {

			char c = strArr[0].charAt(i);

			if (keyMap.containsKey(c)) {

				if (keyMap.get(c) > 0) {

					keyMap.put(c, keyMap.get(c) - 1);

					locations.add(i);

					theT.add(c);

					count--;

					if (count == 0) {

						int cursize = minWindow[1] - minWindow[0];

						if (cursize == 0 || (cursize > (locations.get(strArr[1].length() - 1) - locations.get(0)))) {

							minWindow[0] = locations.get(0);

							minWindow[1] = locations.get(strArr[1].length() - 1);

							if (strArr[0].length() - i < minWindow[1] - minWindow[0]) break;

						}

						keyMap.put(theT.getFirst(), 1);

						locations.removeFirst();

						theT.removeFirst();

						count = 1;

					}

				} else {

					int ind = theT.indexOf(c);

					locations.remove(ind);

					theT.remove(ind);

					locations.add(i);

					theT.add(c);

				}

			}

		}

		return strArr[0].substring(minWindow[0], minWindow[1] + 1);

	}
	
}
