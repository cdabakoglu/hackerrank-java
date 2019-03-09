import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        if (A.equals(new StringBuilder(A).reverse().toString())) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
        
    }
}

// Caner Dabakoglu
// GitHub: https://github.com/cdabakoglu


