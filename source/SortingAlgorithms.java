/* This file contains implementations of sorting algorithms.
 * You are NOT allowed to modify any of the given method headers.
 */

public class SortingAlgorithms {

    /*
     * You may define additional helper functions here if you need to.
     * Make sure the helper functions have the private access modifier, as
     * they will only be used in this class.
     */

    //private long comparisonCount = 0; Can be uncommented to count number of comparisons
    //long swapCount = 0; Can be uncommented to count number of swaps

    public void insertionSort(Record[] arr, int n) {
        // Loop through the whole array
        for (int i = 1; i < n; i++) {
            // Store the current Record to be inserted
            Record key = arr[i];

            // Initialize j to the index before i
            int j = i - 1;

            //Finds position where to place key
            while (j >= 0 && arr[j].getIdNumber() > key.getIdNumber()) {
                //comparisonCount++; Can be uncommented to count number of comparisons
                arr[j + 1] = arr[j]; //move it to the right, it's okay to override the ar[i]
                // swapCount++; Can be uncommented to count number of swaps
                j--; // Move to the (next)previous index
            }

            // Insert the key at its correct sorted position
            arr[j + 1] = key;
            // swapCount++; Can be uncommented to count number of swaps
        }
    }

    public void selectionSort(Record[] arr, int n) {

        //Loop through the whole array
        for(int i = 0; i < n; i++) {

            //Assume first element is the min
            int minIndex = i;

            //keeps track of whats already sorted
            for(int j = i+1; j < n; j++) {
                //comparisonCount++; Can be uncommented to count number of comparisons
                //if it finds a smaller one, change minIndex
                if(arr[j].getIdNumber() < arr[minIndex].getIdNumber()) {
                    minIndex = j;
                }
            }

            //If it found a smaller value, swap
            if(minIndex != i){
                // swapCount++; Can be uncommented to count number of swaps
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
    private void merge(Record[] arr, int p, int q, int r) {
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
            //comparisonCount++; Can be uncommented to count number of comparisons
            // Checks if the left ID number is smaller than or equal to the right ID number
            if(left[i].getIdNumber() <= right[j].getIdNumber()) {
                arr[k++] = left[i++]; // Adds the left value to the array
                // swapCount++; Can be uncommented to count number of swaps
            } else {
                arr[k++] = right[j++]; // Otherwise, adds the right value to the array
                // swapCount++; Can be uncommented to count number of swaps
            }
        }

        // Copy the remaining elements from the left[] array
        while (i < lSize) {
            arr[k++] = left[i++];
            // swapCount++; Can be uncommented to count number of swaps
        }

        // Copy the remaining elements from the right[] array
        while (j < rSize) {
            arr[k++] = right[j++];
            // swapCount++; Can be uncommented to count number of swaps
        }
    }

    /*
     * Define AT LEAST ONE more sorting algorithm here, apart from the
     * ones given above. Make sure that the method accepts an array of
     * records
     */

    //Main method for quicksort
    public void quickSort(Record[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    //Helper method for quicksort
    private int partition(Record[] arr, int low, int high) {
        // Random pivot selection
        int pivotIndex = low + (int)(Math.random() * (high - low + 1));
        swap(arr, pivotIndex, high); // move random pivot to end

        Record pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            //comparisonCount++; Can be uncommented to count number of comparisons
            if (arr[j].getIdNumber() < pivot.getIdNumber()) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    //helper method for quicksort
    private void swap(Record[] arr, int i, int j) {
        if (i != j) {
            //swapCount++; Can be uncommented to count number of swaps
            Record temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }


    //Helper method to check the number of steps taken by a sorting algorithm
    /*
     private void displayTotalSteps(){
        long totalCount = this.comparisonCount + this.swapCount;
        this.comparisonCount = 0;
        this.swapCount = 0;

        System.out.println("Total number of steps: " + totalCount);
    }
     */

}