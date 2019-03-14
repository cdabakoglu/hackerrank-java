import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = arr[j] + sum;
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


// Caner Dabakoglu
// GitHub: https://github.com/cdabakoglu
