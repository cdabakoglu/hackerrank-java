import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.trim().equals("")) {
            System.out.println(0);
        }
        else {
            String[] tokens = s.trim().split("[ !,?\\._'@]+");

            System.out.println(tokens.length);
            for (String str : tokens) {
                System.out.println(str);
            }
        }
        
        
        scan.close();
    }
}


// Caner Dabakoglu
// GitHub: https://github.com/cdabakoglu
