package com.stackandqueue;

public class SClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Stack s = new Stack(3);
		s.push(10);
		s.push(20);
		s.push(30);
		//s.push(40);
		
		System.out.println(s.peek());
		System.out.println();
		s.display();
		
		System.out.println(s.pop());
		
		
	}

}
