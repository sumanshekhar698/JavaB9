package com.java.advance.io;

import java.io.File;
import java.io.IOException;

public class FileHandlingChanges {
	public static void main(String[] args) {
		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B9\\notes\\sample2.txt";
		File file = new File(path);

		System.out.println(file.exists());
		
		
		if(!file.exists()) {
			try {
				boolean newFile = file.createNewFile();
				System.out.println(newFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		
//		if(file.exists()) {
//			file.delete();
//		}

	
	}

}
