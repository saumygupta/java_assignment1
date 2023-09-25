import java.util.*;
public class shoppinggame{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            String winner = findWinner(m, n);
            System.out.println(winner);
        }

        scanner.close();
    }

    static String findWinner(int m, int n) {
        int turn = 1;

        while (true) {
            if (turn % 2 == 1) {
                if (m >= turn) {
                    m -= turn;
                } else {
                    return "Harshit";
                }
            } else {
                if (n >= turn) {
                    n -= turn;
                } else {
                    return "Aayush";
                }
            }

            turn++;
        }

    }
}
