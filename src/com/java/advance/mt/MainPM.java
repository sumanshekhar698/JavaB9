package com.java.advance.mt;



public class MainPM {

	public static void main(String[] args) {
		
		PrimeMinister pm1 = PrimeMinister.createAPm("Mr Modi", 60);
		System.out.println(pm1);
		System.out.println(pm1.hashCode());
		PrimeMinister pm2 = PrimeMinister.createAPm("Mr XYZ", 60);
		System.out.println(pm2);
		System.out.println(pm2.hashCode());


	}

}
