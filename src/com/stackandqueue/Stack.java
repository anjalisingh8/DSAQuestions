package com.stackandqueue;

public class Stack {

	protected int[] data;
	protected int tos;
	
	public Stack() {
		data = new int[5];
		tos = -1;
	}
	
	public Stack(int cap) {
		data = new int[cap];
		tos = -1;
	}
	
	public void push(int item) throws Exception{
		
		if(isFull()) {
			throw new Exception("Overflow");
		}
		tos++;
		data[tos] = item;
	}
	
	public int pop() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int temp = data[tos];
		data[tos] = 0;
		tos--;
		return temp;
	}
	
	public int peek() throws Exception{
		
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int temp = data[tos];
		return temp;
	}
	
	public int size() {
		return tos+1;
	}

	public boolean isEmpty() {
		return size()==0;
	}
	
	public boolean isFull() {
		return size() == data.length;
	}
	
	public void display() {
		for(int i = tos; i >= 0 ; i--)
			System.out.print(data[i]+" ");
	}
}
