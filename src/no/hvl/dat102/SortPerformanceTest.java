package no.hvl.dat102;

import java.util.Random;

import java.util.Random;

public class SortPerformanceTest {
    public static void runPerformanceTests() {
        int[] sizes = {32000, 64000, 128000};

        for (int size : sizes) {
            int[] array = generateRandomArray(size);
            System.out.println("\nTesting med n = " + size);

            measureSortTime("Insertion Sort", array.clone(), sortingAlgoritmer::insertionSort);
            measureSortTime("Selection Sort", array.clone(), sortingAlgoritmer::selectionSort);
            measureSortTime("Quick Sort", array.clone(), sortingAlgoritmer::quickSort);
            measureSortTime("Merge Sort", array.clone(), sortingAlgoritmer::mergeSort);
        }
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
