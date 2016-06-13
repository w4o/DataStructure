package github.frank.stack;
/*
 * ///////////////////栈简要说明////////////////////////
 * 
 * 栈函数：
 * 	MyStack(int size)					创建栈，分配内存初始化栈空间，设置栈容量，栈顶
 * 	void clearStack()					清空栈
 * 	boolean stackEmpty()				栈判空
 * 	boolean stackFull() 				栈判满
 * 	int stackLength()					栈长度
 * 	boolean push(Element element)		新元素入栈，栈顶上升
 * 	Element pop()						栈顶元素出栈，栈顶下降
 * 	void stackTraverse()				遍历栈
 *  Element[] getQueueElements()		栈数组
 * 	
 * 栈属性：
 * 	Element[] stack						栈空间指针
 * 	int stackSize						栈容量
 * 	int iTop							栈顶索引
 *  //////////////////////////////////////////////////
 */

/**
 * 简单栈
 * @author Frank
 *
 */
public class MyStack {

	private Element[] stack;	//栈空间指针
	private int stackSize;		//栈容量
	private int iTop;			//栈顶索引
	
	/**
	 * 栈空间初始化
	 * @param size
	 */
	public MyStack(int size) {
		this.stackSize = size;
		this.stack = new Element[size];
		this.clearStack();
	}
	
	/**
	 * 清空栈
	 */
	public void clearStack() {
		this.iTop = 0;
	}
	
	/**
	 * 判断栈是否为空
	 * @return
	 */
	public boolean stackEmpty() {
		return this.iTop == 0;
	}
	
	/**
	 * 判断栈是否为满
	 * @return
	 */
	public boolean stackFull() {
		return this.iTop == this.stackSize;
	}
	
	/**
	 * 栈长度
	 * @return
	 */
	public int stackLength(){
		return this.iTop;
	} 
	
	/**
	 * 新元素入栈
	 * @param element
	 * @return
	 */
	public boolean push(Element element) {
		if (this.stackFull()) 
			return false;
		stack[iTop] = element;
		this.iTop++;	//栈顶上升
		return true;
	}
	
	/**
	 * 栈顶元素出栈
	 * @return
	 */
	public Element pop() {
		if (this.stackEmpty()) 
			return null;
		this.iTop--;		//栈顶下降
		Element element = stack[iTop];
		return element;
	}
	
	/**
	 * 遍历栈元素
	 */
	public void stackTraverse() {
		for (int i = iTop-1; i >= 0; i--)
			System.out.println(stack[i]);
	}
	
	/**
	 * 获取栈数组
	 * @return
	 */
	public Element[] getQueueElements() {
		Element[] elements = new Element[iTop];
		int index = 0;
		for (int i = iTop-1; i >= 0; i--) { 
			elements[index] = stack[i];
			index++;
		}
		return elements;
	}

}
