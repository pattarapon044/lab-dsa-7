package main;

import queue.CircularArrayQueue2;

public class MainCircularArrayQueue2 {

	public static void main(String[] args) {
		CircularArrayQueue2 queue = new CircularArrayQueue2(3);
		System.out.println("Add 3 elements");
		queue.enqueue(11);
		queue.enqueue(22);
		queue.enqueue(33);
		queue.printQueue();
		queue.printArray();
		System.out.println();
		
		System.out.println("Remove 1 element");
		System.out.println("Remove: " + queue.dequeue());
		queue.printQueue();
		queue.printArray();
		System.out.println();
		
		System.out.println("Add 1 more element");
		queue.enqueue(44);
		queue.printQueue();
		queue.printArray();
		System.out.println();
		
		System.out.println("Add 1 more element");
		queue.enqueue(55);
		queue.printQueue();
		queue.printArray();
		System.out.println();
		
		System.out.println("Remove 1 element");
		System.out.println("Remove: " + queue.dequeue());
		queue.printQueue();
		queue.printArray();
		System.out.println();
				
		System.out.println("Add 4 more elements");
		queue.enqueue(66);
		queue.enqueue(77);
		queue.enqueue(88);
		queue.enqueue(99);
		queue.printQueue();
		queue.printArray();
		System.out.println();
		
		System.out.println("Sum of all elements = " + queue.sum());
	}
}
