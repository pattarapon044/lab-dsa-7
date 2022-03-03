package queue;

public class CircularArrayQueue2 {
	// ----------------- data --------------
	private final int CAPACITY = 10;
	private int[] data; // array to store queue data
	private int front = 0; // pointer for first queue element
	private int size = 0; // size of queue (no. of elements)

	// ----------------- method --------------
	public CircularArrayQueue2() {
		data = new int[CAPACITY];
	}

	public CircularArrayQueue2(int capacity) {
		data = new int[capacity];
	}

	public void resize() {
		int[] temp = new int[data.length * 2];
		System.arraycopy(data, front, temp, 0, size - front);
		System.arraycopy(data, 0, temp, size - front, front);
		front = 0;
		data = temp;
	}

	public void enqueue(int element) {
		if (size == data.length) {
			resize();
		}

		data[(front + size) % data.length] = element;
		size++;
	}

	public int dequeue() {
		if (size == 0) {
			return -999;
		}

		int value = data[front];
		data[front] = 0;
		front = (front + 1) % size;
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

	// print real array
	public void printArray() {
		System.out.print("Array : ");
		for (int i : data) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// find sum of all elements
	public int sum() {
		int sum = 0;
		for (int i : data) {
			sum += i;
		}
		return sum;
	}
}
