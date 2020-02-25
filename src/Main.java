import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse("Kofi"));
        System.out.println(isPalindrome("Anna"));
        System.out.println(euclidsAlgo(8, 10 ));
        int[] arr = new int[]{1,7,13,2,5,9,12,50,4,32,21};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static String reverse(String word){
        if (word.isEmpty()){
            return word;
        }

        return word.charAt(word.length() - 1) + reverse(word.substring(0, word.length() - 1 ));
    }

    public static boolean isPalindrome(String word){
        String lWord = word.toLowerCase();
        if (lWord.equals(reverse(lWord))){
            return true;
        }else{
            return false;
        }
    }

    public static int euclidsAlgo(int x, int y){
        if (x < y){
            int z = y % x;
            if ( z == 0){
                return x;
            } else {
                return euclidsAlgo(z,x);
            }
        }else{
            return euclidsAlgo(y,x);
        }
    }

    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length -1);
    }

    public static void quickSort(int[] arr, int left, int right){
        if (left >= right){
            return;
        }
        int pivot = arr[(left + right)/2];
        int index = partition(arr, left, right, pivot);
        quickSort(arr, left, index -1);
        quickSort(arr, index, right);
    }

    public static int partition(int[] arr, int left, int right, int pivot){
        while(left <= right){
            while (arr[left] < pivot){
                left++;
            }
            while(arr[right] > pivot){
                right--;
            }
            if (left <= right){
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void swap(int[] arr, int position1, int position2){
        int p = arr[position1];
        arr[position1] = arr[position2];
        arr[position2] = p;
    }


}
