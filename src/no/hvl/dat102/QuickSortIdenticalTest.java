package no.hvl.dat102;

public class QuickSortIdenticalTest {
    public static void runQuickSortTest() {
        int[] identicalArray = new int[100000];
        for (int i = 0; i < identicalArray.length; i++) {
            identicalArray[i] = 5; // Alle elementer er like
        }

        long start = System.nanoTime();
        sortingAlgoritmer.quickSort(identicalArray);
        long end = System.nanoTime();
        System.out.println("QuickSort på like tall: " + (end - start) / 1_000_000 + " ms");
    }
}



