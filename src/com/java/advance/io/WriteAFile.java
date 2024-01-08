package com.java.advance.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteAFile {

	public static void main(String[] args) {
		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B9\\notes\\sample2.txt";
		File file = new File(path);
		String msg = "Java io Easy \n Isnt it? \n\n\n\n";
		System.out.println(file.exists());

		try (FileOutputStream fos = new FileOutputStream(file);) {
			fos.write(msg.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
