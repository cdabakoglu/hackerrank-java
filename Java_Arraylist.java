import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> numbers = new ArrayList<>();
            int x = scanner.nextInt();
            for (int k = 0; k < x; k++) {
                numbers.add(scanner.nextInt());
            }
            arrayList.add(numbers);
        }

        int n2 = scanner.nextInt();

        for (int j = 0; j < n2; j++) {
            int q1 = scanner.nextInt();
            int q2 = scanner.nextInt();
            try {
                System.out.println(arrayList.get(q1-1).get(q2-1));
            } catch(Exception e){
                System.out.println("ERROR!");
            }
            
        }
    }
}


// Caner Dabakoglu
// GitHub: https://github.com/cdabakoglu
