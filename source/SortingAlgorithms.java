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
        // Loop through the whole array
        for (int i = 1; i < n; i++) {
            // Store the current Record to be inserted
            Record key = arr[i];

            // Initialize j to the index before i
            int j = i - 1;

            //Finds position where to place key
            while (j >= 0 && arr[j].getIdNumber() > key.getIdNumber()) {
                arr[j + 1] = arr[j]; //move it to the right, it's okay to override the ar[i]
                j--; // Move to the (next)previous index
            }

            // Insert the key at its correct sorted position
            arr[j + 1] = key;
        }
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
        // Checks for the starting and ending index
        if (p < r) {
            // Gets the midpoint of the array
            int q = (p + r) / 2;

            mergeSort(arr, p, q); // Sorts the left half
            mergeSort(arr, q + 1, r); // Sorts the right half
            merge(arr, p, q, r); // Merge both halves
        }
    }

    // Helper variable for Merge Sort
    public void merge(Record[] arr, int p, int q, int r) {
        // Calculates the size of the subarrays
        int lSize = q - p + 1;
        int rSize = r - q;

        // Create temporary arrays to store the values
        Record[] left = new Record[lSize];
        Record[] right = new Record[rSize];

        // Copies the left half of arr[] into left[]
        for (int i = 0; i < lSize; i++)
            left[i] = arr[p + i];
        // Copies the right half of arr[] into right[]
        for (int j = 0; j < rSize; j++)
            right[j] = arr[q + 1 + j];

        int i = 0;
        int j = 0;
        int k = p;

        // Compares the elements from the left[] and right[] arrays
        while(i < lSize && j < rSize) {
            // Checks if the left ID number is smaller than or equal to the right ID number
            if(left[i].getIdNumber() <= right[j].getIdNumber()) {
                arr[k++] = left[i++]; // Adds the left value to the array
            } else {
                arr[k++] = right[j++]; // Otherwise, adds the right value to the array
            }
        }

        // Copy the remaining elements from the left[] array
        while (i < lSize) {
            arr[k++] = left[i++];
        }

        // Copy the remaining elements from the right[] array
        while (j < rSize) {
            arr[k++] = right[j++];
        }
    }

    /*
     * Define AT LEAST ONE more sorting algorithm here, apart from the
     * ones given above. Make sure that the method accepts an array of
     * records
     *
     * suggestion:
     * -bubble sort para madali buhay
     */

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
}