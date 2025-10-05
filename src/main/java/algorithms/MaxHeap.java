package algorithms;

import metrics.PerformanceTracker;

public class MaxHeap {
    private int[] heap;
    private int size;
    private PerformanceTracker tracker;

    public MaxHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
        tracker = new PerformanceTracker();
    }

    public MaxHeap() {
        this(1000);
    }

    public void insert(int value) {
        tracker.incrementMemoryAccesses();
        if (size >= heap.length) {
            throw new IllegalStateException("Heap overflow");
        }
        heap[size] = value;
        size++;
        heapifyUp(size - 1);
    }

    public int extractMax() {
        tracker.incrementMemoryAccesses();
        if (size == 0) {
            throw new IllegalStateException("Heap underflow");
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return max;
    }

    public void increaseKey(int index, int newValue) {
        tracker.incrementArrayAccesses();
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Invalid index");
        }
        if (newValue < heap[index]) {
            throw new IllegalArgumentException("New key is smaller than current key");
        }
        heap[index] = newValue;
        heapifyUp(index);
    }

    private void heapifyUp(int i) {
        while (i > 0) {
            int parent = (i - 1) / 2;
            tracker.incrementComparisons();
            if (heap[i] > heap[parent]) {
                swap(i, parent);
                i = parent;
            } else break;
        }
    }

    private void heapifyDown(int i) {
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int largest = i;

            if (left < size) {
                tracker.incrementComparisons();
                if (heap[left] > heap[largest]) largest = left;
            }

            if (right < size) {
                tracker.incrementComparisons();
                if (heap[right] > heap[largest]) largest = right;
            }

            if (largest != i) {
                swap(i, largest);
                i = largest;
            } else break;
        }
    }

    private void swap(int i, int j) {
        tracker.incrementSwaps();
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public PerformanceTracker getTracker() {
        return tracker;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
