package github.frank.stack;

import org.junit.Test;
import static org.junit.Assert.*;

import github.frank.stack.MyStack;

public class MyStackTest {
	
	@Test
	public void stackTest(){
		
		// 创建栈
		MyStack myStack = new MyStack(4);
		// 栈大小
		int stackLength = myStack.stackLength();
		assertEquals(0, stackLength);
		
		
		// 栈判空
		boolean isEmpty = myStack.stackEmpty();
		assertEquals(true, isEmpty);
		
		
		// 栈判满
		boolean isFull = myStack.stackFull();
		assertEquals(false, isFull);
		
		
		//新元素入栈
		Element el1 = new Element(1, "A");
		Element el2 = new Element(2, "B");
		Element el3 = new Element(3, "C");
		myStack.push(el1);
		myStack.push(el2);
		myStack.push(el3);
		
		isEmpty = myStack.stackEmpty();
		assertEquals(false, isEmpty);
		
		stackLength = myStack.stackLength();
		assertEquals(3, stackLength);
		
		
		// 栈顶元素出栈
		Element element = myStack.pop();
		assertEquals(el3, element);
		
		stackLength = myStack.stackLength();
		assertEquals(2, stackLength);
		
		
		// 获取栈中元素
		Element[] elements = myStack.getQueueElements();
		assertArrayEquals(new Element[]{el2, el1} , elements);
		
		
		// 新元素继续入栈
		Element el4 = new Element(4, "D");
		Element el5 = new Element(5, "E");
		myStack.push(el4);
		myStack.push(el5);
		
		// 栈判满
		isFull = myStack.stackFull();
		assertEquals(true, isFull);
		
		
		// 清空栈
		myStack.clearStack();
		assertEquals(0, myStack.stackLength());
		
		
	} 

}
