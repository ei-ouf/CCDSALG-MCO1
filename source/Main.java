public class Main {
    public static void main(String[] args) {
        // TODO: Use this method to run your experiments.
        FileReader fr = new FileReader();
        SortingAlgorithms sorter = new SortingAlgorithms();
        Record[] almostSortedRecords;

        almostSortedRecords = fr.readFile("source/data/almostsorted.txt");
        long startTime = System.currentTimeMillis();
        //The choice for sorting algorithm must be changed manually
        sorter.quickSort(almostSortedRecords, 0,100000-1);
        long endTime = System.currentTimeMillis();
        sorter.getOperationTotal();
        System.out.println("Almost Sorted Sorting time: " + (endTime-startTime));


        Record[] random100records;

        random100records = fr.readFile("source/data/random100.txt");
        startTime = System.currentTimeMillis();
        //The choice for sorting algorithm must be changed manually
        sorter.quickSort(random100records, 0,100-1);
        endTime = System.currentTimeMillis();
        sorter.getOperationTotal();
        System.out.println("random100records Sorting time: " + (endTime-startTime));

        Record[] random25000records;

        random25000records = fr.readFile("source/data/random25000.txt");
        startTime = System.currentTimeMillis();
        //The choice for sorting algorithm must be changed manually
        sorter.quickSort(random25000records, 0,25000-1);
        endTime = System.currentTimeMillis();
        sorter.getOperationTotal();
        System.out.println("random25000records Sorting time: " + (endTime-startTime));


        Record[] random50000records;

        random50000records = fr.readFile("source/data/random50000.txt");
        startTime = System.currentTimeMillis();
        //The choice for sorting algorithm must be changed manually
        sorter.quickSort(random50000records, 0, 50000-1);
        endTime = System.currentTimeMillis();
        sorter.getOperationTotal();
        System.out.println("random50000records Sorting time: " + (endTime-startTime));


        Record[] random75000records;

        random75000records = fr.readFile("source/data/random75000.txt");
        startTime = System.currentTimeMillis();
        //The choice for sorting algorithm must be changed manually
        sorter.quickSort(random75000records, 0,75000-1);
        endTime = System.currentTimeMillis();
        sorter.getOperationTotal();
        System.out.println("random75000records Sorting time: " + (endTime-startTime));


        Record[] random100000records;

        random100000records = fr.readFile("source/data/random100000.txt");
        startTime = System.currentTimeMillis();
        //The choice for sorting algorithm must be changed manually
        sorter.quickSort(random100000records, 0,100000-1);
        endTime = System.currentTimeMillis();
        sorter.getOperationTotal();
        System.out.println("random100000records Sorting time: " + (endTime-startTime));

        Record[] totallyReversedRecords;

        totallyReversedRecords = fr.readFile("source/data/totallyreversed.txt");
        startTime = System.currentTimeMillis();
        //The choice for sorting algorithm must be changed manually
        sorter.quickSort(totallyReversedRecords, 0,100000-1);
        endTime = System.currentTimeMillis();
        sorter.getOperationTotal();
        System.out.println("totallyReversedRecords Sorting time: " + (endTime-startTime));
    }
}
