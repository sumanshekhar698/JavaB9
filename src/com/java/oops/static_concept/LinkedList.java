package com.java.oops.static_concept;

public class LinkedList {

	public static void main(String[] args) {
		Node node = new Node(7,null);
		Employee.sayMyCompanyName();

	}
	
	static class Node{
		int data;
		Node next;
		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
		
	}

}
