package com.java.advance.io;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B9\\notes\\notes.txt";
		File file = new File(path);

		System.out.println(file.exists());

		if (file.exists()) {
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getCanonicalPath());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.isDirectory());
			System.out.println(file.isFile());

		}

	}

}
