package github.frank.queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueTest {

	@Test
	public void createQueue(){
		
		// 创建环形队列
		MyQueue myQueue = new MyQueue(4);
		// 队列大小
		int queueLength = myQueue.queueLength();
		assertEquals(0, queueLength);
		
		
		// 队列判空
		boolean empty = myQueue.queueEmpty();
		assertEquals(true, empty);
		
		
		// 元素入列
		Element el1 = new Element(1, "A");
		Element el2 = new Element(2, "B");
		Element el3 = new Element(3, "C");
		
		myQueue.inQueue(el1);
		myQueue.inQueue(el2);
		myQueue.inQueue(el3);
		// 队列大小
		queueLength = myQueue.queueLength();
		assertEquals(3, queueLength);
		
		
		//队列批判空
		empty = myQueue.queueEmpty();
		assertEquals(false, empty);
		
		
		//队列判满
		boolean full = myQueue.queueFull();
		assertEquals(false, full);
		
		
		//队列出列
		Element element = myQueue.deQueue();
		assertEquals(el1, element);
		
		
		//队列大小
		queueLength = myQueue.queueLength();
		assertEquals(2, queueLength);
		
		
		// 获取队列中元素
		Element[] elements = myQueue.getQueueElements();
		assertArrayEquals(new Element[]{el2, el3}, elements);
		
		
		//队列入列
		Element el4 = new Element(4, "D");
		Element el5 = new Element(5, "E");
		myQueue.inQueue(el4);
		myQueue.inQueue(el5);
		queueLength = myQueue.queueLength();
		assertEquals(4, queueLength);
		
		
		//队列判满
		full = myQueue.queueFull();
		assertEquals(true, full);
		
		
		//清空队列
		myQueue.clearQueue();
		assertEquals(0, myQueue.queueLength());
		
		
	} 
	
	

}
