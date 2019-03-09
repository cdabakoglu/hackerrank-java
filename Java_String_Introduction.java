import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int sum = A.length() + B.length();
        String compare;
        if (A.compareTo(B) > 0) {
            compare = "Yes";
        }
        else {
            compare = "No";
        }
        String line = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase() + " " + B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.println(sum);
        System.out.println(compare);
        System.out.println(line);
        
    }
}


// Caner Dabakoglu
// GitHub: https://github.com/cdabakoglu
