package queue;

public class EntryPoint {

	public static void main(String[] args) {
		Queue<Integer> queue=new Queue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		
		queue.dequeue();
		System.out.println("Current size of the queue: "+queue.size());
			
		

	}

}
