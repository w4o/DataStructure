package github.frank.queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueTest {

	@Test
	public void createQueue(){
		
		MyQueue myQueue = new MyQueue(4);
		int queueLength = myQueue.queueLength();
		
		assertEquals(0, queueLength);
		
		myQueue.inQueue(12);
		myQueue.inQueue(13);
		myQueue.inQueue(14);
		
		queueLength = myQueue.queueLength();
		
		assertEquals(3, queueLength);
		
	} 
	
	

}
