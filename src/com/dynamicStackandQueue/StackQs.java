package com.dynamicStackandQueue;
import java.util.Stack;

public class StackQs {
	
	public static void celebrityProblem(int[][] arr) {
		
		Stack<Integer> s = new Stack<>();
		
		for(int i = 0; i < arr.length; i++)
			s.push(i);
		
		while(s.size() >= 2) {
			int a = s.pop();
			int b = s.pop();
			
			// a knows b , a cannot be celebrity
			if(arr[a][b] == 1) {
				s.push(b);
			}
			
			// a does not know b, b cannot be celebrity
			else {
				s.push(a);
			}
		}
		
		int candidate = s.pop();
		for(int i = 0; i < arr.length; i++) {
			 
			if( i != candidate) {
				if(arr[candidate][i] ==  1 || arr[i][candidate] == 0) {
					System.out.println("No celeb");
					return;
				}
			}
			
		}
		System.out.println(candidate +" is Celebrity");
	}
	public static void main(String[] args) {
		
		int[][] arr = {{0,1,1,1}, {1,0,1,0} , {0,0,0,0},{1,1,1,0}};
		celebrityProblem(arr);
		
	}

}
