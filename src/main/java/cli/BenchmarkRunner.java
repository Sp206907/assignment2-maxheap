package cli;

import algorithms.MaxHeap;

import java.util.Random;
import java.util.Scanner;

public class BenchmarkRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter heap size: ");
        int n = scanner.nextInt();

        MaxHeap heap = new MaxHeap(n + 10);
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            heap.insert(rand.nextInt(10000));
        }

        System.out.println("Extracting all elements...");
        while (!heap.isEmpty()) {
            heap.extractMax();
        }

        System.out.println(heap.getTracker());
    }
}
