import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

        int[] arr = new int[]{447,221,43,586,412,334,435,430,42,28,23};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void bubbleSort(int[] arr){
        boolean unSorted = true;
        while(unSorted){
            unSorted = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]){
                    int x = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = x;
                    unSorted = true;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


}
