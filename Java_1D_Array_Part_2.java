import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        return checkSolution(leap, game, 0);
    }

    public static boolean checkSolution(int leap, int[] game, int i) {
        if (i < 0 || game[i] == 1) {
            return false;
        }
        else if (i + 1 >= game.length || i + leap >= game.length) {
            return true;
        }

        game[i] = 1;

        return checkSolution(leap, game, i + leap) ||
                checkSolution(leap, game, i + 1) ||
                checkSolution(leap, game, i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

