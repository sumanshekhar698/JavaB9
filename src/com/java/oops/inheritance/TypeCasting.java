package com.java.oops.inheritance;

public class TypeCasting {

	public static void main(String[] args) {

		CricketPlayer c1 = new CricketPlayer("Virat", 40, 20, 5.8f, Gender.MALE);
		Player p1 = c1;// upcasting and is natural (implicit)
//		p1.special();
		c1.special();

//		Player p2 = new Player();
//		CricketPlayer c2 = (CricketPlayer) p2;// Downcasting is forcful (explicit)

		Player p3 = new CricketPlayer("Virat", 40, 20, 5.8f, Gender.MALE);// upcasting
		Player p5 = new Player();// upcasting


		if (p3 instanceof CricketPlayer) {
			CricketPlayer c4 = (CricketPlayer) p3;// downcasting is only poossible if the obkject is already upcasted

		}
		
		if (p5 instanceof CricketPlayer) {
			CricketPlayer c4 = (CricketPlayer) p5;// downcasting is only poossible if the obkject is already upcasted

		}

	}

}
