package com.dynamicStackandQueue;


import java.util.Stack;


public class StackMin2{

//	public static int minStack(Stack a) {
//		
//		Stack<Integer> s = new Stack<>();
//
//		Stack<Integer> min = new Stack<>();
//		
//		if(a.isEmpty()) {
//			s.push(item);
//			min.push(item);
//		}
//		
//		else if( item < s.peek()) {
//			s.push(item);
//			min.push(item);
//		}
//		else {
//			s.push(item);
//			min.push(min.peek());
//		}
//		
//		return min.peek();
//		
//	}
	
	Stack<Integer> s = new Stack<>();
	private int min;
	
	public void push(int item){
		
		if(s.isEmpty()) {
			s.push(item);
			min = item;
		}
		
		else if(item >= min) {
			s.push(item); //no encryption
		}
		
		else if(item < min) {
			s.push(2*item - min); //encryption  s.peek() < min then this shows min has changed
			min = item;
			
		}
		
	}
	
	
	public int peek() throws Exception{
		
		if(s.isEmpty()) {
			throw new Exception("Stack Empty");
		}
		
		//encryption
		else if(s.peek() < min)
			return min;
		
		// no encryption
		else if(s.peek() >= min)
			return s.peek();
		
		else 
			return min;
	}

	public int pop()  throws Exception{
		
		if(s.isEmpty()) {
			throw new Exception("Stack Full");
		}
		
		// encryption
		else if(s.peek() < min) {
			 
			int originalValue = min;
			int topMostElement = s.pop();
			
			min = 2*min  - topMostElement;
			
			return originalValue;
		}
		
		else // no encryption super.peek >= min
			return s.pop();
		
		
	}
//	
	public int min() throws Exception {
		
		if(s.isEmpty()) {
			throw new Exception("Stack Empty");
		}
		
		else 
			return min;
		
	}
}
