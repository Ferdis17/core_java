package sizeDirectory;

import java.io.File;
import java.util.Scanner;

public class DirectorySize {

	public static void main(String[] args) {
		System.out.println("Enter a directory or a file: ");
		Scanner sc = new Scanner(System.in);
		String directory =sc.nextLine();
		
		System.out.println(getSize(new File(directory)));

	}

	public static long getSize(File file) {
		long size = 0;

		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; files != null && i < files.length; i++) {
				size += getSize(files[i]);
			}
		} else {
			size += file.length();
		}
		return size;
	}

}
