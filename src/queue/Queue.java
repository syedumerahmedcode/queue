package queue;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue<T> implements Iterable<T> {
	private LinkedList<T> list = new LinkedList<T>();

	public Queue() {

	}

	public Queue(T firstElement) {
		 enqueue(firstElement);
	}

	public int size() {
		return list.size();
	}

	public boolean isEmplty() {
		return size() == 0;
	}

	// Peek the elemnt at the front of the queue
	// The method throws an error of the queue is empty
	public T peek() {
		throwErrorIfQueueIsEmpty();
		return list.peekFirst();
	}

	private void throwErrorIfQueueIsEmpty() {
		if(isEmplty()) {
			throw new RuntimeException("Queue is Empty");
		}
	}
	
	public T dequeue() {
		throwErrorIfQueueIsEmpty();
		return list.removeFirst();
	}
	
	public void enqueue(T element) {
		list.addLast(element);		
	}

	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

}
