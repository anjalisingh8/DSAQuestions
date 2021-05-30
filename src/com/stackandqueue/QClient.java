package com.stackandqueue;

public class QClient {

	public static void main(String[] args) throws Exception {
		
		Queue q = new Queue();
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.display();
		
		System.out.println(q.deque());
		System.out.println(q.deque());
		
		q.enque(40);
		q.enque(50);
		
		q.enque(60);
		q.enque(70);
		
		q.display();
		
	}

}
