package unit10;

/**
 * Illustrate steps in merge sort recursion by printing each of the steps and recursive levels to help
 *  with understanding the algorithmic steps.
 *
 * https://replit.com/@yokang/MergeSort
 * Nice visualization at https://opendsa-server.cs.vt.edu/embed/mergesortAV
 */
class MergeSort {
    public static int COL1_SIZE = 35;

    public static void main(String args[]) {
        int[][] multipleArraysToSort = {
                { 2, 1 },
                { 3, 2, 1 },
                { 4, 3, 2, 1 },
                { 5, 4, 3, 2, 1 },
                { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 },
        };

        for (int[] arr: multipleArraysToSort) {
            System.out.printf("%" + COL1_SIZE + "s%s%n", "-------------------- array to sort:", toString(arr));
            mergeSort("array", 0, arr);
        }
    }

    public static void mergeSort(String debugText, int recursiveLevel, int[] arr) {
        debugText += recursiveLevel;
        System.out.printf("%" + COL1_SIZE + "s%s%n", debugText + " mergeSort:", toString(arr));
        int length = arr.length;
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < length; i++) {
            right[i - mid] = arr[i];
        }

        mergeSort("left", recursiveLevel++, left);
        mergeSort("right", recursiveLevel++, right);
        merge(arr, left, right, mid, length - mid);
        System.out.printf("%" + COL1_SIZE + "s%s%n", debugText + " sorted and merged:", toString(arr));
    }

    public static void merge(int[] arr, int[] leftArr, int[] rightArr, int leftIndex, int rightIndex) {
        int i = 0, j = 0, k = 0;
        while (i < leftIndex && j < rightIndex) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            }
            else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < leftIndex) {
            arr[k++] = leftArr[i++];
        }
        while (j < rightIndex) {
            arr[k++] = rightArr[j++];
        }
    }

    static String toString(int[] arr) {
        StringBuilder str = new StringBuilder();

        for (int num : arr) {
            str.append(String.format("%2s", num)).append("  ");
        }

        return str.toString();
    }
}