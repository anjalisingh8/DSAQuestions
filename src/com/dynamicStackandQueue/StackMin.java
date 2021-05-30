package com.dynamicStackandQueue;


import com.stackandqueue.DynamicStack;

public class StackMin  extends DynamicStack{

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
	
	private int min;
	
	@Override
	public void push(int item) throws Exception {
		
		if(isEmpty()) {
			super.push(item);
			min = item;
		}
		
		else if(item >= min) {
			super.push(item); //no encryption
		}
		
		else if(item < min) {
			super.push(2*item - min); //encryption  s.peek() < min then this shows min has changed
			min = item;
			
		}
		
	}
	
	@Override
	public int peek() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Stack Empty");
		}
		
		//encryption
		else if(super.peek() < min)
			return min;
		
		// no encryption
		else if(super.peek() >= min)
			return super.peek();
		
		else 
			return min;
	}
	
	@Override
	public int pop()  throws Exception{
		
		if(isEmpty()) {
			throw new Exception("Stack Full");
		}
		
		// encryption
		else if(super.peek() < min) {
			 
			int originalValue = min;
			int topMostElement = super.pop();
			
			min = 2*min  - topMostElement;
			
			return originalValue;
		}
		
		else // no encryption super.peek >= min
			return super.pop();
		
		
	}
//	
	public int min() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Stack Empty");
		}
		
		else 
			return min;
		
	}
}
