import java.util.Scanner;

public class Solution {

static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        boolean result = false;

        StringBuilder bb = new StringBuilder(b);

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < bb.length(); j++) {
                    if (a.charAt(i) == bb.charAt(j)) {
                        bb.deleteCharAt(j);
                        break;
                    }
                }
            }

            if (bb.length() == 0) {
                result = true;
            }
        }

        return result;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}


// Caner Dabakoglu
// GitHub: https://github.com/cdabakoglu
