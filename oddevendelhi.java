import java.util.*;
public class oddevendelhi {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] carNumbers = new int[n];

        for (int i = 0; i < n; i++) {
            carNumbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (isAllowedOnSunday(carNumbers[i])) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        scanner.close();
    }
    static boolean isAllowedOnSunday(int carNumber) {
        int evenSum = 0;
        int oddSum = 0;

        while (carNumber > 0) {
            int digit = carNumber % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            carNumber /= 10;
        }

        return (evenSum % 4 == 0) || (oddSum % 3 == 0);

    }
}
