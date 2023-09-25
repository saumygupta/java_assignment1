import java.util.*;
public class isarmstrong {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println(isArmstrong);
    }
    static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = (int) Math.log10(num) + 1;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNum;

    }
}
