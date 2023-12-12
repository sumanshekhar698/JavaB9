package com.java.oops.inheritance;

public class CricketPlayer extends Player {
	int runs;

//	public CricketPlayer() {
//		super();
//	}

	public CricketPlayer(String name, int age, int sportsCareer, float height, Gender gender) {
//		this();
		super(name, age, sportsCareer, height, gender);
		System.out.println();
	}

	CricketPlayer() {

	}
	
	@Override
	void test(){//Runtime Polymorphism
		super.test();//super can be only used to acccess IMMEIDIATE parent
		System.out.println("test 2");
	}
	
	void special() {//specialzed methods
		
	}

}
class IndiaCricket extends CricketPlayer{
	void test() {
//		int x = super.super.age;
	}
	
}
