package main;

import queue.ArrayQueue;

public class MainArrayQueue {

	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue(6);
		queue.printQueue();
		System.out.println();

		// Enqueue 5 elements
		System.out.println("### Add Data to Empty queue ###");
		System.out.print("enqueue() :");
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i);
			System.out.print(" " + i);
		}
		System.out.println();
		queue.printQueue();
		
		//Peek
		System.out.println("First element is " + queue.peek());
		System.out.println();

		// Remove 3 elements
		System.out.println("------ Remove 3 elements from Queue ------");
		for (int i = 1; i <= 3; i++) {
			System.out.println("dequeue() : " + queue.dequeue());
			queue.printQueue();
			System.out.println();
		}
		
		//Peek
		System.out.println("First element is " + queue.peek());
		System.out.println();

		// Add 2 more elements
		System.out.println("+++ Add more Data to Queue +++");
		System.out.println("enqueue() : 10");
		queue.enqueue(10);
		queue.printQueue();
		System.out.println();

		System.out.println("enqueue() : 20");
		queue.enqueue(20);
		queue.printQueue();
		System.out.println();
		
		System.out.println("+++ Dequeue all data : +++");
		System.out.print("Remove ");
		while (!queue.isEmpty()) {
			System.out.print(queue.dequeue() + " ");
		}
		System.out.println();
		queue.printQueue();
	}
}
