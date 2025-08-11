package aug2;

import java.util.Arrays;

class SortThread extends Thread {
    int[] arr;

    SortThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        Arrays.sort(arr);
    }
}

public class prog3 {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {9, 2, 5, 1, 7, 3, 8, 4, 6};
        
        int mid = arr.length / 2;
        int[] firstHalf = Arrays.copyOfRange(arr, 0, mid);
        int[] secondHalf = Arrays.copyOfRange(arr, mid, arr.length);

        SortThread t1 = new SortThread(firstHalf);
        SortThread t2 = new SortThread(secondHalf);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Merge the sorted halves
        int[] sortedArray = new int[arr.length];
        int i = 0, j = 0, k = 0;
        while (i < firstHalf.length && j < secondHalf.length) {
            if (firstHalf[i] < secondHalf[j]) {
                sortedArray[k++] = firstHalf[i++];
            } else {
                sortedArray[k++] = secondHalf[j++];
            }
        }
        while (i < firstHalf.length) sortedArray[k++] = firstHalf[i++];
        while (j < secondHalf.length) sortedArray[k++] = secondHalf[j++];

        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}
