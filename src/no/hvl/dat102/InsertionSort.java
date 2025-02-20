package no.hvl.dat102;

public class InsertionSort {

    // Standard insertion sort
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }

    // Optimalisert versjon A: Flytter minste element først
    public static void insertionSortOptimizedA(int[] a) {
        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        int temp = a[minIndex];
        a[minIndex] = a[0];
        a[0] = temp;

        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            int j = i - 1;
            while (a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }

    // Optimalisert versjon B: Setter inn to elementer samtidig
    public static void insertionSortOptimizedB(int[] a) {
        for (int i = 1; i < a.length - 1; i += 2) {
            int min = Math.min(a[i], a[i + 1]);
            int max = Math.max(a[i], a[i + 1]);
            int j = i - 1;

            while (j >= 0 && a[j] > max) {
                a[j + 2] = a[j];
                j--;
            }
            a[j + 2] = max;

            while (j >= 0 && a[j] > min) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = min;
        }
    }

    // Optimalisert versjon C: Kombinerer begge forbedringene
    public static void insertionSortOptimizedC(int[] a) {
        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        int temp = a[minIndex];
        a[minIndex] = a[0];
        a[0] = temp;

        for (int i = 1; i < a.length - 1; i += 2) {
            int min = Math.min(a[i], a[i + 1]);
            int max = Math.max(a[i], a[i + 1]);
            int j = i - 1;

            while (a[j] > max) {
                a[j + 2] = a[j];
                j--;
            }
            a[j + 2] = max;

            while (a[j] > min) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = min;
        }
    }
}
