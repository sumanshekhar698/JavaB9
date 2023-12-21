package com.java.advance.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAFile {

	public static void main(String[] args) {
		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B9\\notes\\sample.txt";
		File file = new File(path);
		System.out.println(file.exists());
//		FileInputStream fis = null;

		try (FileInputStream fis = new FileInputStream(file);) {

			int readChar = 0;
			while ((readChar = fis.read()) != -1) {
				System.out.print((char) readChar);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		finally {
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	}

}
