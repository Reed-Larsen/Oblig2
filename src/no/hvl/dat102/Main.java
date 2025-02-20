package no.hvl.dat102;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== Starter sorteringstester ===");

        // 🚀 Kjør tester fra Oppgave 1
        System.out.println("\n--- Oppgave 1: Insertion Sort ---");
        sortTester.runTests();

        // 🚀 Kjør tester fra Oppgave 2
        System.out.println("\n--- Oppgave 2: Sammenligning av sorteringsalgoritmer ---");
        SortPerformanceTest.runPerformanceTests();

        // 🚀 Ekstra test: QuickSort med like elementer
        System.out.println("\n--- Oppgave 2: QuickSort med like tall ---");
        QuickSortIdenticalTest.runQuickSortTest();
    }
}


