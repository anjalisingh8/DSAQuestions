package com.dynamicStackandQueue;

import com.stackandqueue.DynamicStack;
//import com.stackandqueue.Stack;

public class StackQs1 {
	
	public static void main(String[] args) throws Exception{
		DynamicStack s = new DynamicStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		// check content of reverse before reverse
		s.display();
		System.out.println();
		System.out.println("--------Display Revrse-------");
		displayReverse(s);
		System.out.println();
		//check of stack after displaying Reverse
		System.out.println("-----------------------------");
		s.display();
		System.out.println();
		System.out.println("------------Actual Reverse----------------");
		s.display();
		System.out.println();
		actualReverse(s, new DynamicStack());
		s.display();
	}
	
	
	public static void displayReverse(DynamicStack s) throws Exception {
		
		//base case
		if(s.isEmpty()) {
			return;
		}
		
		int temp = s.pop();
		
		 displayReverse(s);
		
		 System.out.print(temp+" ");
		
		 s.push(temp);
	}

	public static void actualReverse(DynamicStack s, DynamicStack helper) throws Exception {
		
		if(s.isEmpty()) {
			actualReverse2(s,helper);
			 //s = helper;
			 return;
		}
		
		int temp = s.pop();
		helper.push(temp);
		
		actualReverse(s, helper);
		
		
		
	}
	
	public static void actualReverse2(DynamicStack s, DynamicStack helper) throws Exception {
		
		if(helper.isEmpty()) {
			return;
		}
		int temp = helper.pop();
		actualReverse2(s,helper);
		
		s.push(temp);
		
	}
	

}
