package com.java.advance.io.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {//Serailization

	public static void main(String[] args) {

		Employee e1 = new Employee("John", 4, "Acme Corp");
		e1.companyCode = "001A";
		System.out.println(e1);

		String path = "C:\\Users\\suman\\eclipse-workspace\\Java B9\\notes\\sample.txt";
		File file = new File(path);

		try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(e1);
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
