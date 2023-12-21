package com.java.advance.io.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDeserialization {//Deserialization
	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B9\\notes\\sample.txt";
		File file = new File(path);

		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis);) {
			Employee e1 = (Employee) ois.readObject();
			System.out.println(e1.companyCode);
			System.out.println(e1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
