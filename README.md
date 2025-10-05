
---

# 🧮 Assignment 2 — MaxHeap Implementation (Java)

## 📘 Overview

This project implements a **MaxHeap data structure in Java**, featuring:

* Core heap operations (`insert`, `extractMax`, `increaseKey`)
* Performance tracking with a custom **`PerformanceTracker`** class
* A **CLI benchmarking tool** for heap performance testing
* **JUnit 5 test suite** ensuring correctness and stability

It is designed as part of an **Algorithms and Data Structures** assignment to demonstrate:

* Efficient heap-based priority queue implementation
* Performance analysis (comparisons, swaps, memory accesses)
* Software engineering practices (testing, branching, documentation)

---

## ⚙️ Features

✅ **MaxHeap Implementation**

* Insert, extract maximum, increase key, and heapify logic
* Maintains heap property at all times

✅ **Performance Metrics**

* Tracks comparisons, swaps, and memory operations

✅ **CLI Benchmark Tool**

* Randomized input generation
* Execution time and performance report

✅ **JUnit 5 Testing**

* Unit and integration tests for all heap operations
* Validation of performance metrics

---

## 🗂️ Project Structure

```
assignment2-maxheap/
├── src/
│   ├── main/java/
│   │   ├── algorithms/MaxHeap.java
│   │   ├── metrics/PerformanceTracker.java
│   │   └── cli/BenchmarkRunner.java
│   └── test/java/
│       └── algorithms/MaxHeapTest.java
├── docs/
│   ├── analysis-report.pdf
│   └── performance-plots/
│       └── maxheap_results.csv
├── README.md
└── pom.xml
```

---

## 🧰 Installation and Setup

### Prerequisites

* **Java 11 or later**
* **Maven 3.6+**

### Clone the Repository

```bash
git clone https://github.com/<your-username>/assignment2-maxheap.git
cd assignment2-maxheap
```

### Build the Project

```bash
mvn clean compile
```

### Run the Tests

```bash
mvn test
```

### Run the CLI Benchmark

```bash
mvn exec:java -Dexec.mainClass="cli.BenchmarkRunner"
```

When prompted:

```
Enter heap size: 1000
```

Output example:

```
Extracting all elements...
Performance Metrics {Comparisons = 2458, Swaps = 1231, Array Accesses = 3690, Memory Accesses = 1005}
```

---

## 🧩 How It Works

1. **Heap Construction:**
   New elements are inserted into the heap array, maintaining heap property via `heapifyUp`.

2. **Extraction:**
   The largest element (root) is swapped with the last, removed, and heapified down.

3. **Performance Tracking:**
   Every comparison, swap, and memory access is logged through the `PerformanceTracker`.

4. **Benchmarking:**
   The CLI measures total operations and prints summarized performance metrics.

---

## 🧪 Example Output (CLI Benchmark)

```
Enter heap size: 500
Extracting all elements...
Performance Metrics {Comparisons = 1103, Swaps = 553, Array Accesses = 1650, Memory Accesses = 502}
```

---

## 🌿 Branch Naming Convention

| Branch Name            | Purpose                                          |
| ---------------------- | ------------------------------------------------ |
| `main`                 | Stable, tested release-ready code                |
| `feature/algorithm`    | Core algorithm implementation (`MaxHeap.java`)   |
| `feature/metrics`      | Performance tracking (`PerformanceTracker.java`) |
| `feature/testing`      | Unit tests (JUnit 5)                             |
| `feature/cli`          | Command-line interface for benchmarking          |
| `feature/optimization` | Performance and memory optimizations             |

---

## 🔄 Git Workflow

### 1️⃣ Create and switch to a new branch

```bash
git checkout -b feature/algorithm
```

### 2️⃣ Make your changes

Edit your files, then:

```bash
git add .
git commit -m "feat(algorithm): implement MaxHeap insert/extract"
git push origin feature/algorithm
```

### 3️⃣ Open a Pull Request (PR)

* Go to GitHub → your repository
* Click **Compare & Pull Request**
* Choose:

  * **Base:** `main`
  * **Compare:** `feature/algorithm`
* Add a short description and submit PR

---

## 🧪 Branch Workflows

### `feature/algorithm`

Implements core heap operations.

```bash
git switch feature/algorithm
git add src/main/java/algorithms/MaxHeap.java
git commit -m "feat(algorithm): implement heapify logic"
git push
```

### `feature/metrics`

Implements performance tracking.

```bash
git switch feature/metrics
git add src/main/java/metrics/PerformanceTracker.java
git commit -m "feat(metrics): track comparisons and swaps"
git push
```

### `feature/testing`

Adds JUnit 5 test suite.

```bash
git switch feature/testing
git add src/test/java/algorithms/MaxHeapTest.java
git commit -m "test(maxheap): add heap property and edge case tests"
git push
```

### `feature/cli`

Implements benchmarking interface.

```bash
git switch feature/cli
git add src/main/java/cli/BenchmarkRunner.java
git commit -m "feat(cli): add CLI performance testing"
git push
```

### `feature/optimization`

Improves algorithmic performance.

```bash
git switch feature/optimization
git add src/main/java/algorithms/MaxHeap.java
git commit -m "perf(maxheap): optimize siftDown performance"
git push
```

---

## 🚀 Merging Branches to Main

After all features are implemented and tested:

```bash
git switch main
git pull
git merge feature/algorithm
git merge feature/metrics
git merge feature/testing
git merge feature/cli
git merge feature/optimization
git push
```

Or, perform merges through **Pull Requests** on GitHub.

---

## 🏷️ Release Tagging

When stable:

```bash
git switch main
git pull
git tag v1.0 -m "v1.0: Complete MaxHeap implementation with metrics and tests"
git push origin v1.0
```

---

## 🧾 Commit Message Convention

Follow **Conventional Commits** for clarity:

| Type        | Description         | Example                                 |
| ----------- | ------------------- | --------------------------------------- |
| `feat:`     | Add a new feature   | `feat(algorithm): implement heapify`    |
| `fix:`      | Fix a bug           | `fix(maxheap): correct array index bug` |
| `test:`     | Add tests           | `test(cli): add benchmark test case`    |
| `docs:`     | Update docs         | `docs(readme): add usage examples`      |
| `perf:`     | Improve performance | `perf(maxheap): reduce redundant swaps` |
| `refactor:` | Code refactor       | `refactor(metrics): simplify counters`  |

---

## 📊 Documentation

All performance data and reports are stored in the `docs/` folder:

```
docs/
├── analysis-report.pdf
└── performance-plots/
    └── maxheap_results.csv
```

* **`analysis-report.pdf`** → detailed explanation of results
* **`maxheap_results.csv`** → benchmark data for performance plots

---

## 👨‍💻 Author

**Ernar**
Assignment 2 — Data Structures & Algorithms
© 2025 All Rights Reserved

---

