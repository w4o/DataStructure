package github.frank.queue;

/**
 * 简单队列
 * @author Frank
 *
 */
public class MyQueue {
	
	private int[] queue;		//队列数组指针
	private int queueLength; 	//队列元素个数
	private int queueCapacity;	//队列数组容量
	
	private int iHead;			//队列头索引
	private int iTail;			//队列尾索引
	
	/**
	 * 创建队列
	 * @param queueCapacity
	 */
	public MyQueue(int queueCapacity) {
		
		this.queueCapacity = queueCapacity;		//赋值队列数组容量
		queue = new int[queueCapacity];			//根据队列容量实例化队列数组
		// 清空队列
		this.clearQueue();
	}
	
	/**
	 * 销毁队列
	 */
	public void destroyQueue() {
		this.queue = null;
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
	public boolean inQueue(int element) {
		if (queueFull()) 
			return false;
		
		queue[iTail] = element;
		iTail = (iTail+1) % queueCapacity;
		queueLength ++ ;
		return true;
	} 
	
	/**
	 * 首元素出列
	 * @param element
	 * @return
	 */
	public boolean deQueue(Integer element) {
		if (queueEmpty()) 
			return false;
		
		queue[iHead] = element;
		iHead = (iHead+1) % queueCapacity;
		queueLength --;
		return true;
	}
	
	/**
	 * 遍历队列
	 */
	public void queueTraverse(){
		
		for (int i = iHead; i < queueLength; i++)
			System.out.println(this.queue[i%queueCapacity]);
		
	} 
	

}
