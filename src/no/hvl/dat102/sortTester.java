package no.hvl.dat102;

import java.util.Random;

public class sortTester {

    public static void runTests() {
        int size = 100000; // Endre størrelse her
        int[] array = generateRandomArray(size);

        measureSortTime("Standard Insertion Sort", array.clone(), InsertionSort::insertionSort);
        measureSortTime("Optimized A (Flytt minste først)", array.clone(), InsertionSort::insertionSortOptimizedA);
        measureSortTime("Optimized B (To elementer samtidig)", array.clone(), InsertionSort::insertionSortOptimizedB);
        measureSortTime("Optimized C (Kombinert)", array.clone(), InsertionSort::insertionSortOptimizedC);
    }

    private static void measureSortTime(String sortName, int[] array, SortingAlgorithm algorithm) {
        long start = System.nanoTime();
        algorithm.sort(array);
        long end = System.nanoTime();
        System.out.println(sortName + ": " + (end - start) / 1_000_000 + " ms");
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100000);
        }
        return arr;
    }

    @FunctionalInterface
    interface SortingAlgorithm {
        void sort(int[] array);
    }
}

