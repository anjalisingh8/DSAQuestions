package com.stackandqueue;

public class DynamicQueue extends Queue {

	


	@Override
	public void enque(int item) throws Exception {
		
		int na[] = new int[2* data.length];
		
		if(isFull()) {
			
			for(int i = 0; i < size; i++) {
				
				int idx = (i+front) % data.length;
				na[i] = data[idx];
				
			}
			
			data = na;
			front = 0;
			
		}
		
		super.enque(item);
	}
}
