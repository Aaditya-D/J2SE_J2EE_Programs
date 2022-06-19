import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program24 {

	static void queue() {
		Queue<String> Q = new LinkedList<String>(); // Queue Declaration- This Implementation can only access features of queue interface
		Q.add("Hi");
		Q.add("Hello");
		Q.add("How are you");
		System.out.println("Current elements in the queue Q: " + Q);
		for (String var : Q) { // Iteration over queue using for-each
			System.out.println(var);
		}
		Queue<Integer> Q1 = new LinkedList<>();
		Q1.add(15);
		Q1.add(57);
		Q1.add(42);
		System.out.println("Current elements in the queue Q1: " + Q1);
		System.out.println("Element to be removed first: " + Q1.peek());
		Q1.remove(15);
		System.out.println("Current elements in the queue Q1: " + Q1);
	}

	static void prioirityQueue() { // Priority is decided based on the ASCII value
		Queue<Integer> queue = new PriorityQueue<>();
		queue.offer(10); // offer works same as add
		queue.offer(40);
		queue.offer(80);
		queue.offer(20);
		queue.add(90);
		System.out.println("elements present in Priority queue " + queue);
		for (int var : queue) { // Iteration over queue using for-each
			System.out.println(var);
		}
		System.out.println("Element head of the queue: " + queue.peek());
		queue.poll();
		System.out.println("Elements after removing the head: " + queue);
		queue.poll();
		System.out.println("Elements after removing the head: " + queue);
		queue.remove(80);
		System.out.println("Elements after removing the head: " + queue);
	}

	static void arrayDeque() {
		ArrayDeque<Integer> adq = new ArrayDeque<>(); // ArrayDeque Declaration
		adq.offer(25);
		adq.offer(50);
		adq.offer(100);
		adq.offer(80);
		System.out.println("present elements :" + adq);
		System.out.println("Head: " + adq.peek());
		System.out.println("First element: " + adq.peekFirst());
		System.out.println("Last element: " + adq.peekLast());
		System.out.println("Head to be removed: " + adq.poll());
		System.out.println("After removing the head: " + adq);
		System.out.println("First element to be removed: " + adq.pollFirst());
		System.out.println("After removing the first element: " + adq);
		System.out.println("Last element to be removed: " + adq.pollLast());
		System.out.println("After removing the last element: " + adq);
	}

	public static void main(String[] args) {
		queue();
		prioirityQueue();
		arrayDeque();
	}

}
