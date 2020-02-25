import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Socks {

    char[] charr = "okay".toCharArray();

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashMap<String, Integer> socks = new HashMap();
        for( int i = 0; i < n; i++){
            if(socks.containsKey(String.valueOf(ar[i]))){
                socks.put(String.valueOf(ar[i]), socks.get(String.valueOf(ar[i])) + 1 );
            }else{
                socks.put(String.valueOf(ar[i]), 1 );
            }
        }

        int total = 0;

        for ( String key : socks.keySet()){
            int divisor = socks.get(key) / 2;
            total += divisor;
        }

        return total;


    }

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        char[] arr = s.toCharArray();
        int sea = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'D'){
                count += -1;
            }else{
                count += 1;
                if (count == 0){
                    sea += 1;
                }
            }
        }

        return sea;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{1, 3, 3, 1,2,1};
        sockMerchant(6, arr);
    }
}
