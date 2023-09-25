import java.util.*;
public class bostonnumber {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (isBostonNumber(n)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }


    static boolean isBostonNumber(int n) {
        int sumOfDigits = sumOfDigits(n);
        int sumOfPrimeFactors = sumOfPrimeFactors(n);
        return sumOfDigits == sumOfPrimeFactors;
    }

    static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }


    static int sumOfPrimeFactors(int num) {
        int sum = 0;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                sum += sumOfDigits(i);
                num /= i;
            }
        }
        return sum;


    }
}