public class Main {
    public static void main(String[] args) {
        // TODO: Use this method to run your experiments.
        FileReader fr = new FileReader();
        SortingAlgorithms sorter = new SortingAlgorithms();
        Record[] almostSortedRecords;

        almostSortedRecords = fr.readFile("source/data/almostsorted.txt");
        long startTime = System.currentTimeMillis();
        sorter.bubbleSort(almostSortedRecords, 100000);
        long endTime = System.currentTimeMillis();
        System.out.println("Almost Sorted Sorting time: " + (endTime-startTime));

        /*
        for (int i = 0; i < 100000; i++){
            System.out.println("number: " + i + " " + almostSortedRecords[i].getIdNumber() + " " + almostSortedRecords[i].getName());
        }
         */


        Record[] random100records;

        random100records = fr.readFile("source/data/random100.txt");
        startTime = System.currentTimeMillis();
        sorter.bubbleSort(random100records, 100);
        endTime = System.currentTimeMillis();
        System.out.println("random100records Sorting time: " + (endTime-startTime));

        /*
        for (int i = 0; i < 100; i++){
            System.out.println(random100records[i].getIdNumber() + " " + random100records[i].getName());
        }

         */

        Record[] random25000records;

        random25000records = fr.readFile("source/data/random25000.txt");
        startTime = System.currentTimeMillis();
        sorter.bubbleSort(random25000records, 25000);
        endTime = System.currentTimeMillis();
        System.out.println("random25000records Sorting time: " + (endTime-startTime));

        /*
        for (int i = 0; i < 25000; i++){
            System.out.println(random25000records[i].getIdNumber() + " " + random25000records[i].getName());
        }

         */


        Record[] random50000records;

        random50000records = fr.readFile("source/data/random50000.txt");
        startTime = System.currentTimeMillis();
        sorter.bubbleSort(random50000records, 50000);
        endTime = System.currentTimeMillis();
        System.out.println("random50000records Sorting time: " + (endTime-startTime));


        Record[] random75000records;

        random75000records = fr.readFile("source/data/random75000.txt");
        startTime = System.currentTimeMillis();
        sorter.bubbleSort(random75000records, 75000);
        endTime = System.currentTimeMillis();
        System.out.println("random75000records Sorting time: " + (endTime-startTime));


        Record[] random100000records;

        random100000records = fr.readFile("source/data/random100000.txt");
        startTime = System.currentTimeMillis();
        sorter.bubbleSort(random100000records, 100000);
        endTime = System.currentTimeMillis();
        System.out.println("random100000records Sorting time: " + (endTime-startTime));

        Record[] totallyReversedRecords;

        totallyReversedRecords = fr.readFile("source/data/totallyreversed.txt");
        startTime = System.currentTimeMillis();
        sorter.bubbleSort(totallyReversedRecords, 100000);
        endTime = System.currentTimeMillis();
        System.out.println("totallyReversedRecords Sorting time: " + (endTime-startTime));
    }
}
