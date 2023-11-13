package com.java.basics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		outer: while (flag) {

			System.out
					.println(" Enter 1 : Coke \n Enter 2: Limca \n Enter 3: Green Tea \n Enter 4: Water \n 0 for Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Enjoy the Coke\n");
				break;
			}
			case 2: {
				System.out.println("Enjoy the Limca\n");
				break;
			}
			case 3: {
				System.out.println("Enjoy the Green Tea\n");
				break;
			}
			case 4: {
				System.out.println("Enjoy the Water\n");
				break;
			}
			case 0: {
				System.out.println("Thanks for Using me\n");
//				flag = false;
				break outer;
//				System.exit(78);
			}
			default: {
				System.out.println("Invalid Option");
				break;
			}

			}
		}

	}

}
