import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        System.out.println(a.add(b) +"\n" + a.multiply(b));
    }
}

// Caner Dabakoglu
// GitHub: https://github.com/cdabakoglu
