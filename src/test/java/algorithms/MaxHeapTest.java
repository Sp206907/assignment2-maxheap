package algorithms;

import metrics.PerformanceTracker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxHeapTest {

    private MaxHeap heap;

    @BeforeEach
    public void setup() {
        heap = new MaxHeap(10);
    }

    @Test
    public void testInsertAndExtract() {
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);

        assertEquals(20, heap.extractMax(), "Max should be 20");
        assertEquals(10, heap.extractMax(), "Next max should be 10");
        assertFalse(heap.isEmpty(), "Heap should not be empty after two extracts");
    }

    @Test
    public void testIncreaseKey() {
        heap.insert(5);
        heap.insert(15);
        heap.insert(10);
        heap.increaseKey(2, 25);

        assertEquals(25, heap.extractMax(), "After increaseKey, 25 should be max");
    }

    @Test
    public void testSingleElement() {
        heap.insert(42);
        assertEquals(42, heap.extractMax());
        assertTrue(heap.isEmpty());
    }

    @Test
    public void testDuplicates() {
        heap.insert(5);
        heap.insert(5);
        heap.insert(5);
        assertEquals(5, heap.extractMax());
        assertEquals(5, heap.extractMax());
        assertEquals(5, heap.extractMax());
        assertTrue(heap.isEmpty());
    }

    @Test
    public void testHeapPropertyMaintained() {
        int[] values = {4, 10, 3, 5, 1};
        for (int v : values) heap.insert(v);

        int prev = heap.extractMax();
        while (!heap.isEmpty()) {
            int next = heap.extractMax();
            assertTrue(prev >= next, "Heap property violated: " + prev + " < " + next);
            prev = next;
        }
    }

    @Test
    public void testPerformanceTracking() {
        heap.insert(10);
        heap.insert(15);
        heap.extractMax();

        PerformanceTracker tracker = heap.getTracker();
        assertTrue(tracker.getComparisons() >= 0);
        assertTrue(tracker.getMemoryAccesses() >= 0);
        assertTrue(tracker.getSwaps() >= 0);
    }
}
