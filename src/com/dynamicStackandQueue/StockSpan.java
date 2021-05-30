package com.dynamicStackandQueue;

import java.util.Stack;

public class StockSpan {
	
	public static int[] span(int[] arr) {
		
		Stack<Integer> s = new Stack<>();
		int ans[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			
			while(!s.isEmpty() && arr[i] >= arr[s.peek()]) {
				s.pop();
			}
			if(s.isEmpty())
				ans[i] = i;
			else
				ans[i] = i - s.peek() - 1;
			
			s.push(i);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		
		int[] arr = {80,50,70,30,20,40,90,10,15,35};
		
		int b[] = span(arr);
		for(int val: b)
			System.out.println(val);

	}

}
