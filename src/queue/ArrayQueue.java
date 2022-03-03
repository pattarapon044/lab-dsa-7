package queue;

public class ArrayQueue {
	// ----------------- data --------------
	private final int CAPACITY = 10;
	private int[] data; // array to store queue data
	private int front = 0; // pointer for first queue element
	private int size = 0; // size of queue (no. of elements)

	// ----------------- method --------------
	public ArrayQueue() {
		data = new int[CAPACITY];
	}

	public ArrayQueue(int capacity) {
		data = new int[capacity];
	}

	public void enqueue(int element) {
		if (front + size == data.length) {
			System.out.println("queue is full!");
			return;
		}

		data[front + size++] = element;
	}

	public int dequeue() {
		if (size == 0) {
			return -999;
		}

		size--;
		return data[front++];
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
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
}
