import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FileReader fr = new FileReader();
        SortingAlgorithms sorter = new SortingAlgorithms();
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while(loop) {

        // Present the menu to the user
        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Insertion Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Merge Sort");
        System.out.println("4. Quick Sort");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
            // Define a sorting interface
            SortingMethod selectedSort = null;

            switch (choice) {
                case 1 -> selectedSort = arr -> sorter.insertionSort(arr, arr.length);
                case 2 -> selectedSort = arr -> sorter.selectionSort(arr, arr.length);
                case 3 -> selectedSort = arr -> sorter.mergeSort(arr, 0, arr.length - 1);
                case 4 -> selectedSort = arr -> sorter.quickSort(arr, 0, arr.length - 1);
                case 0 -> loop = false;
                default -> System.out.println("Invalid choice.");
            }

            //if user selected a sort, run said sort on all files
            if(choice>=1 && choice<=4) {
                // Run benchmarks
                runSortOnFile("almostsorted.txt", fr, sorter, selectedSort, "Almost Sorted");
                runSortOnFile("random100.txt", fr, sorter, selectedSort, "Random 100");
                runSortOnFile("random25000.txt", fr, sorter, selectedSort, "Random 25000");
                runSortOnFile("random50000.txt", fr, sorter, selectedSort, "Random 50000");
                runSortOnFile("random75000.txt", fr, sorter, selectedSort, "Random 75000");
                runSortOnFile("random100000.txt", fr, sorter, selectedSort, "Random 100000");
                runSortOnFile("totallyreversed.txt", fr, sorter, selectedSort, "Totally Reversed");
            }
        }

    }

    // Functional interface for sorting methods
    interface SortingMethod {
        void sort(Record[] array);
    }

    // Generalized sorting with timing
    private static void runSortOnFile(String filename, FileReader fr, SortingAlgorithms sorter, SortingMethod sortMethod, String label) {
        Record[] data = fr.readFile("source/data/" + filename);

        //sort
        long startTime = System.currentTimeMillis();
        sortMethod.sort(data);
        long endTime = System.currentTimeMillis();

        //display
        System.out.println(label + " Sorting time: " + (endTime - startTime) + " ms");
        System.out.println("Total number of steps: " + sorter.getTotalSteps());
    }
}