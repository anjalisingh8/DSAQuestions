package com.dynamicStackandQueue;

import java.util.Stack;

public class NextGreater {
	
	public static void Loop(int[] arr) {
		
		int next;
		
		for(int i = 0; i < arr.length;i++) {
			next = -1;
			for(int j = i +1; j < arr.length; j++) {
				
				if(arr[j]>arr[i]) {
					next = arr[j];
					break;
				}
					
			}
			System.out.println(arr[i] + "-->" + next);
			
		}
		System.out.println();
		
		
	}
	
	public static void nextGreater(int[] arr) {
		
		Stack<Integer> s = new Stack<>();
		
		
		// goto every element
		for(int i = 0; i < arr.length; i++) {
			
			//arr[i] want to be next greater
			while(!s.isEmpty() && arr[i] > s.peek()) {
				System.out.println(s.pop() +"-->"+ arr[i]);
			}
			// push arr[i];
			s.push(arr[i]);
			
			
		}
		while(!s.isEmpty()) {
			System.out.println(s.pop()+"-->"+ -1);
		}
	}
	
	public static int[] nextGreaterElement2(int[] arr) {

		int[] ans = new int[arr.length];

		Stack<Integer> s = new Stack<>();

		// go to every element
		for (int i = 0; i < arr.length; i++) {

			// arr[i] want to be next greater
			while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
				ans[s.pop()] = arr[i];
			}

			// push index i
			s.push(i);
		}

		// if some values are left in stack, then there nge is -1
		while (!s.isEmpty()) {
			ans[s.pop()] = -1;
		}

		return ans;

	}

	
	
   public static int[] nextGreater3(int[] arr) {
		
		Stack<Integer> s = new Stack<>();
		int ans[] = new int[arr.length];
		
		
		for(int i = arr.length; i < 0; i--) {
			
			while(!s.isEmpty() && arr[i] >= s.peek()) {
				s.pop();
			}
			
			if(s.isEmpty()) {
				ans[i] = -1;
			}
			else
				ans[i] = s.peek();
			
			s.push(arr[i]);
		}
		return ans;
			
	}
	

	public static void main(String[] args) {
		
		int[] arr = {50,30,20,40,10,45,5,60,8,15};
		Loop(arr);
		nextGreater(arr);
		
		
		System.out.println("-------------------------------------------------");
		int[] b = nextGreaterElement2(arr);
		for(int val: b) {
			System.out.println(val);
		}
		

	}

}
