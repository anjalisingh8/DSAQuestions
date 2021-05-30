package com.dynamicStackandQueue;

public class Client  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		StackMin s = new StackMin();
		
		s.push(10);
		s.push(50);
		s.push(40);
		s.push(6);
		s.push(45);
		s.push(45);
		s.push(2);
		
		System.out.println(s.min());

		System.out.println(" peek "+s.peek());
		
		s.pop();
		
		System.out.println("peek again " + s.peek());
		
		System.out.println(s.min());

	}

}
