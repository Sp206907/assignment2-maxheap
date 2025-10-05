package metrics;

public class PerformanceTracker {
    private long comparisons;
    private long swaps;
    private long arrayAccesses;
    private long memoryAccesses;

    public void incrementComparisons() { comparisons++; }
    public void incrementSwaps() { swaps++; }
    public void incrementArrayAccesses() { arrayAccesses++; }
    public void incrementMemoryAccesses() { memoryAccesses++; }

    public void reset() {
        comparisons = 0;
        swaps = 0;
        arrayAccesses = 0;
        memoryAccesses = 0;
    }

    public long getComparisons() { return comparisons; }
    public long getSwaps() { return swaps; }
    public long getArrayAccesses() { return arrayAccesses; }
    public long getMemoryAccesses() { return memoryAccesses; }

    @Override
    public String toString() {
        return "Performance Metrics {" +
                "Comparisons = " + comparisons +
                ", Swaps = " + swaps +
                ", Array Accesses = " + arrayAccesses +
                ", Memory Accesses = " + memoryAccesses +
                '}';
    }
}
