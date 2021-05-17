
public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LQueue queue= new LQueue(4);

		queue.enqueue(10);

		queue.enqueue(20);

		queue.enqueue(30);

		queue.enqueue(40);

		queue.dequeue();

		queue.enqueue(60);

		queue.dequeue();

		queue.enqueue(70);
		System.out.print(queue.length());



	}

}
