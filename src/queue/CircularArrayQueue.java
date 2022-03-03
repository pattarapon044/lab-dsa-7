package queue;

public class CircularArrayQueue {
	// ----------------- data --------------
	private final int CAPACITY = 10;
	private int[] data; // array to store queue data
	private int front = 0; // pointer for first queue element
	private int size = 0; // size of queue (no. of elements)

	// ----------------- method --------------
	public CircularArrayQueue() {
		data = new int[CAPACITY];
	}

	public CircularArrayQueue(int capacity) {
		data = new int[capacity];
	}

	public void enqueue(int element) {
		if (size == data.length) {
			System.out.println("Queue is full!");
			return;
		}

		data[(front + size) % data.length] = element;
		size++;
	}

	public int dequeue() {
		if (size == 0) {
			return -999;
		}

		int value = data[front];
		front = (front + 1) % data.length;
		size--;
		return value;
	}

	public int peek() {
		return data[front];
	}

	// get current size (no. of elements)
	public int getSize() {
		return size;
	}

	// is queue empty?
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	// print all queue members
	public void printQueue() {
		if (size == 0) {
			System.out.println("Queue is empty!");
			return;
		}

		System.out.print("Queue : ");
		for (int i = front; i < (front + size); i++) {
			System.out.print(data[i % data.length] + " ");
		}
		System.out.println();
	}
}
