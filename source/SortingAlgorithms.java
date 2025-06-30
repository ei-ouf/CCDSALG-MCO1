/* This file contains implementations of sorting algorithms.
 * You are NOT allowed to modify any of the given method headers.
 */

public class SortingAlgorithms {

    /*
     * You may define additional helper functions here if you need to.
     * Make sure the helper functions have the private access modifier, as
     * they will only be used in this class.
     */

    public void insertionSort(Record[] arr, int n) {
        // TODO: Implement this sorting algorithm here.

    }

    public void selectionSort(Record[] arr, int n) {

        //Loop through the whole array
        for(int i = 0; i < n; i++) {

            //Assume first element is the min
            int minIndex = i;

            //keeps track of whats already sorted
            for(int j = i+1; j < n; j++) {

                //if it finds a smaller one, change minIndex
                if(arr[j].getIdNumber() < arr[minIndex].getIdNumber()) {
                    minIndex = j;
                }
            }

            //If it found a smaller value, swap
            if(minIndex != i){
                Record temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public void mergeSort(Record[] arr, int p, int r) {
        // TODO: Implement this sorting algorithm here.

    }

    public void bubbleSort(Record[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].getIdNumber() > arr[j + 1].getIdNumber()) {
                    Record temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }



    /*
     * Define AT LEAST ONE more sorting algorithm here, apart from the
     * ones given above. Make sure that the method accepts an array of
     * records
     *
     * suggestion ko lang:
     * -bubble sort para madali buhay
     * -quick sort
     */

}