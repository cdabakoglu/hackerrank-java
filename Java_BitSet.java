import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int process = scanner.nextInt();
        BitSet bitSet1 = new BitSet(size);
        BitSet bitSet2 = new BitSet(size);
        BitSet[] bitSets = new BitSet[3];

        bitSets[1] = bitSet1;
        bitSets[2] = bitSet2;

        for (int i = 0; i < process; i++) {
            String op = scanner.next();
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();

            switch (op) {
                case "AND":
                    bitSets[n1].and(bitSets[n2]);
                    break;
                case "OR":
                    bitSets[n1].or(bitSets[n2]);
                    break;
                case "XOR":
                    bitSets[n1].xor(bitSets[n2]);
                    break;
                case "SET":
                    bitSets[n1].set(n2);
                    break;
                case "FLIP":
                    bitSets[n1].flip(n2);
                    break;
                default:
                    System.out.println("Unknown operation!");
                    break;
            }

            System.out.println(bitSets[1].cardinality() + " " + bitSets[2].cardinality());
        }


    }
}


// Caner Dabakoglu
// GitHub: https://github.com/cdabakoglu
