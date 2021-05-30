package com.dynamicStackandQueue;

import com.stackandqueue.DynamicQueue;



public class QueueQs {
	
	public  static void displayReverse(DynamicQueue q, int count) throws Exception {
		
		if(count == q.size()) {
			return;
		}
		
		int temp = q.deque();
		
		q.enque(temp);
		
		displayReverse(q, count+1);
		
		System.out.println(temp);
		
		
	}
	
	public  static void actualReverse(DynamicQueue q) throws Exception {
		
		if(q.isEmpty()) {
			return;
		}
		
		int temp = q.deque();
		
		actualReverse(q);
		
		q.enque(temp);
	}

	
	public static void main(String[] args) throws Exception{
		
		DynamicQueue q = new DynamicQueue();
		
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.enque(50);
		
		System.out.println("------------");
		
		q.display();
		
		
		System.out.println("------Display Reverse------");
		
		displayReverse(q, 0);
		
		System.out.println("------------");
		q.display();
		
		System.out.println("---------Actual Reverse-----");
		actualReverse(q);
		
		
		System.out.println("------------");
		q.display();
		
		//Queue<Integer> q = new Queue();
		
		
		
	}
} 
