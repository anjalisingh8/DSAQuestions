package com.stackandqueue;

public class DynamicStack extends Stack {
	
	@Override
	public  void push(int item) throws Exception {
		
		if(isFull()) {
			
			//create new array of length 2
			int na[] = new int[2*data.length];
			
			//copy all elemnets of data to na
			for(int i = 0; i < tos ;i ++)
				na[i] = data[i];
			
			//reference change
			data = na;
			
			
		}
		super.push(item);
	}

}
