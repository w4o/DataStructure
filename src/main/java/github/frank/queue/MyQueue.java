package github.frank.queue;
/*
 * ///////////////////队列简要说明////////////////////////
 * 
 * 队列函数：
 * 	MyQueue(int queueCapacity)			创建队列
 * 	void clearQueue()					清空队列
 * 	boolean queueEmpty()				队列判空
 * 	boolean queueFull() 				队列判满
 * 	int queueLength()					队列长度
 * 	boolean inQueue(Element element)	新元素入列
 * 	Element deQueue()					首元素出列
 * 	void queueTraverse()				遍历队列
 *  Element[] getQueueElements()		队列数组
 * 	
 * 队列属性：
 * 	Element[] queue						队列数组指针
 * 	int queueLength						队列元素个数
 * 	int queueCapacity					队列数组容量
 *  int iHead							队列头索引
 *  int iTail							队列尾索引
 *  //////////////////////////////////////////////////
 */
/**
 * 简单队列
 * @author Frank
 *
 */
public class MyQueue {
	
	private Element[] queue;	//队列数组指针
	private int queueLength; 	//队列元素个数
	private int queueCapacity;	//队列数组容量
	
	private int iHead;			//队列头索引
	private int iTail;			//队列尾索引
	
	/**
	 * 创建队列
	 * @param queueCapacity
	 */
	public MyQueue(int queueCapacity) {
		
		this.queueCapacity = queueCapacity;			//赋值队列数组容量
		queue = new Element[queueCapacity];			//根据队列容量实例化队列数组
		// 清空队列
		this.clearQueue();
	}
	
	/**
	 * 清空队列
	 */
	public void clearQueue() {
		iHead = 0;
		iTail = 0;
		queueLength = 0;
	}
	
	/**
	 * 判断队列空
	 * @return
	 */
	public boolean queueEmpty(){
		return this.queueLength == 0;
	} 
	
	/**
	 * 判断队列满
	 * @return
	 */
	public boolean queueFull(){
		return this.queueLength == queueCapacity;
	}
	
	/**
	 * 队列长度
	 * @return
	 */
	public int queueLength() {
		return this.queueLength;
	}
	
	/**
	 * 新元素入列
	 * @param element
	 * @return
	 */
	public boolean inQueue(Element element) {
		if (queueFull()) 
			return false;
		
		queue[iTail] = element;
		iTail = (iTail+1) % queueCapacity;
		this.queueLength ++ ;
		return true;
	} 
	
	/**
	 * 首元素出列
	 * @return
	 */
	public Element deQueue() {
		if (queueEmpty())
			return null;
		
		Element element = queue[iHead];
		iHead = (iHead+1) % queueCapacity;
		this.queueLength --;
		return element;
	}
	
	/**
	 * 遍历队列
	 */
	public void queueTraverse(){
		
		for (int i = iHead; i < queueLength + iHead; i++)
			System.out.println(this.queue[i%queueCapacity]);
		
	}
	
	/**
	 * 获取队列元素数组
	 * @return
	 */
	public Element[] getQueueElements(){
		Element [] elements = new Element[queueLength];
		int index = 0;
		for (int i = iHead; i < queueLength + iHead; i++) {
			elements[index] = this.queue[i%queueCapacity];
			index++;
		}
		return elements;
		
	} 
	

}
