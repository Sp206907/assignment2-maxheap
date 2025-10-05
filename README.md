
```markdown
# Assignment 2 – Algorithmic Analysis and Peer Code Review  
### Algorithm: **Max-Heap Implementation (with Performance Metrics and CLI Benchmark)**

---

## 📘 Overview

This project implements a **Max-Heap** data structure in Java as part of **Assignment 2**.  
It includes:
- A complete heap implementation with `insert`, `extractMax`, and `increaseKey`.
- A `PerformanceTracker` to monitor comparisons, swaps, and memory accesses.
- A CLI-based benchmark runner.
- Comprehensive **JUnit 5** test coverage.

This work satisfies the assignment requirements for:
- Clean implementation
- Algorithmic analysis
- Empirical performance testing
- Git workflow documentation

---

## 📁 Project Structure

```

assignment2-maxheap/
├── src/
│   ├── main/java/
│   │   ├── algorithms/MaxHeap.java
│   │   ├── metrics/PerformanceTracker.java
│   │   └── cli/BenchmarkRunner.java
│   └── test/java/
│       └── algorithms/MaxHeapTest.java
├── pom.xml
└── README.md

````

---

## ⚙️ Requirements

- **Java 11 or higher**
- **Maven 3.9+**

Verify your environment:

```bash
java -version
mvn -v
````

---

## 🧩 Build and Run Instructions

### 1. Compile and Run Tests

```bash
mvn clean test
```

If everything is configured correctly, all tests should pass with:

```
BUILD SUCCESS
```

### 2. Run the CLI Benchmark

```bash
mvn -q -DskipTests package
java -cp target/assignment2-maxheap-1.0-SNAPSHOT.jar cli.BenchmarkRunner
```

You will be prompted to enter a heap size (e.g., `1000`).
The program inserts random integers into the heap, extracts them all, and prints performance metrics.

---

## 🧮 Implementation Details

### **Class: MaxHeap**

* **Type:** Array-based binary Max-Heap
* **Operations:**

    * `insert(int value)` — adds a new element, maintains heap property via sift-up.
    * `extractMax()` — removes and returns the maximum element, uses sift-down.
    * `increaseKey(int index, int newValue)` — increases key value and adjusts heap.
    * `isEmpty()`, `getSize()` — utility methods.

### **PerformanceTracker**

Tracks internal algorithmic operations:

* `comparisons`
* `swaps`
* `arrayAccesses`
* `memoryAccesses`

### **BenchmarkRunner**

Interactive CLI tool to test performance with random data.
Displays tracked metrics after all operations complete.

---

## 🧠 Asymptotic Complexity

| Operation        | Time Complexity (Worst/Average) | Best Case | Space Complexity |
| ---------------- | ------------------------------- | --------- | ---------------- |
| `insert`         | O(log n)                        | Ω(1)      | O(1)             |
| `extractMax`     | O(log n)                        | Ω(1)      | O(1)             |
| `increaseKey`    | O(log n)                        | Ω(1)      | O(1)             |
| Build by inserts | O(n log n)                      | —         | O(1)             |

> Note: A full bottom-up heap construction could achieve Θ(n), but this implementation emphasizes individual insert and extract operations.

---

## 🧪 Testing (JUnit 5)

### Covered Test Cases

* ✅ Insert and extract correctness
* ✅ Heap property maintenance
* ✅ Increase-key functionality
* ✅ Duplicates and single-element cases
* ✅ Performance metric validation
* ✅ Empty heap and invalid index exceptions

Example command:

```bash
mvn test
```

### Example Negative Tests (recommended additions)

```java
assertThrows(IllegalStateException.class, () -> new MaxHeap(0).extractMax());
assertThrows(IllegalArgumentException.class, () -> heap.increaseKey(1, -10));
```

---

## 📊 Benchmarking & Empirical Validation

### BenchmarkRunner Behavior

1. Accepts an input size `n`.
2. Inserts `n` random integers.
3. Extracts all while maintaining heap order.
4. Prints tracked metrics at the end.

Sample Output:

```
Enter heap size: 10000
Extracting all elements...
Performance Metrics {Comparisons = 152376, Swaps = 76182, Array Accesses = 0, Memory Accesses = 0}
```

You can extend this for **CSV export** to analyze time vs input size for `n = 100, 1000, 10000, 100000`.

---

## 🧭 Git Workflow

### Recommended Branching

| Branch                 | Purpose                        |
| ---------------------- | ------------------------------ |
| `main`                 | Stable releases only           |
| `feature/algorithm`    | Implementation work            |
| `feature/metrics`      | Tracking performance metrics   |
| `feature/testing`      | Unit tests                     |
| `feature/cli`          | CLI interface                  |
| `feature/optimization` | Optimizations and improvements |

### Example Commit Flow

```bash
git add -A
git commit -m "feat(algorithm): implemented MaxHeap with performance tracking"
git commit -m "test: added JUnit tests for heap operations"
git commit -m "docs(readme): added project documentation"
git tag v1.0
git push && git push --tags
```

---

## 🧾 Complexity Analysis Summary

* **Time Complexity:**

    * Average: Θ(log n)
    * Worst: O(log n)
    * Best: Ω(1)
* **Space Complexity:** O(1) auxiliary (in-place)
* **Performance Factors:**

    * Number of comparisons grows with `n log n`.
    * Swap frequency directly affects practical runtime.
    * Cache behavior and branch prediction can influence constant factors.


## 🧑‍💻 Author Information

* **Student:** *Ernar*
* **Partner:** *Nurdaulet*
* **Algorithm:** Max-Heap (with `increaseKey` and `extractMax`)
* **Course:** Algorithmic Analysis and Peer Code Review — Fall 2025



C:\Users\ernar\assignment2-maxheap\

```bash
git add README.md
git commit -m "docs(readme): added complete project documentation"
git push
````
