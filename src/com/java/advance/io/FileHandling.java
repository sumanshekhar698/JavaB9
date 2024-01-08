package com.java.advance.io;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {// File Folder
//		File -> Text and Binary

		System.out.println(0.0f / 0.0f);
//		System.out.println(0 / 0);//Unchecked Exception
		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B9\\notes\\notes.txt";
		File file = new File(path);

		System.out.println(file.exists());// path is valid or not

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
