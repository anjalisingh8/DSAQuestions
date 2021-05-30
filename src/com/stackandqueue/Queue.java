package com.stackandqueue;

public class Queue {
	
	 protected int data[];
	 protected int front;
	 protected int size;
	
//	Queue(int cap){
//		data = new int[cap];
//		front = 0;
//		size = 0;
//	}
	
	public void enque(int item) throws Exception {
		
		if(isFull()) {
			throw new Exception("Queue full");
		}
		
		//int idx = front + size;
		
		int idx = (front+size) % data.length; //circular queue
		data[idx] = item;
		size++;
	}
	
	public int deque() {
		int temp = data[front];
		data[front] = 0;
		front = (front+1) % data.length; //circular queue
		size--;
		return temp;
	}
	
	public int peek() {
		return data[front+size];
	}
	
	public int getFront() {
		int temp = data[front];
		
		return temp;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isFull() {
		return size() == data.length;
	}
	
	public boolean isEmpty() {
		return size() ==0;
	}
	
	public void display() {
		
		for(int i = 0; i < size; i++) {
			 
			int idx = (i + front) % data.length; //circular queue
			System.out.print(data[idx]+" ");
		}
		System.out.println();
	}

}
