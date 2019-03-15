import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int l = scanner.nextInt();
            linkedList.add(l);
        }
        int q = scanner.nextInt();
        for (int j = 0; j < q; j++) {
            String process = scanner.next();
            if (process.equals("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                linkedList.add(x,y);
            }
            else {
                int x = scanner.nextInt();
                linkedList.remove(x);
            }
        }
        scanner.close();
        
        for (Integer number : linkedList) {
            System.out.print(number + " ");
        }
    }
}


// Caner Dabakoglu
// GitHub: https://github.com/cdabakoglu
