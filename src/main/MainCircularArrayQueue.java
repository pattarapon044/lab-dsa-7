package main;

import queue.CircularArrayQueue;

public class MainCircularArrayQueue {
	public static void main(String[] args) {
		CircularArrayQueue queue = new CircularArrayQueue(12);
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
		System.out.println();
		
		// Dequeue 3 elements
		System.out.println("------ Remove the 3 elements from Queue ------");
		for (int i = 1; i <= 3; i++) {
			System.out.println("dequeue() : " + queue.dequeue()); 
			queue.printQueue();
			System.out.println();
		}
		
		// Peek
		System.out.println("First element is " + queue.peek());
		System.out.println();
		
		// Add 10 more elements
		System.out.println("+++ Add more Data to Queue +++"); 
		System.out.print("enqueue() :");
		for (int i = 10; i <= 100; i += 10) {
			queue.enqueue(i);
			System.out.print(" " + i);
		}
		System.out.println();
		queue.printQueue();
		System.out.println();
		
		// Test queue full
		System.out.println("+++ Add more Data to Queue +++"); 
		System.out.println("enqueue() : 110");
		queue.enqueue(110);

		System.out.println("\n+++ Dequeue all data : +++");
		System.out.print("Remove ");
		while (!queue.isEmpty()) {
			System.out.print(queue.dequeue() + " ");
		}
		System.out.println();
		queue.printQueue();    
	}
}
