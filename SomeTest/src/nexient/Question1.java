package nexient;

import java.nio.file.Files;
import java.nio.file.Path;

public class Question1 {
	
	public static void main(String [] args) {
		System.out.println(longest("I am a man of GODD"));
	}

	public static String longest(String sentence) {
		String[] words;
		String longuestString = "";
		if (null != sentence) {
			words = sentence.split(" ");
			for (String word : words) {
				if (word.length() % 2 == 0 && word.length() > longuestString.length()) {
					longuestString = word;
				}
			}
		}
		return longuestString;

	}

}
