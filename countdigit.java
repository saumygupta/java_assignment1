import java.util.*;
public class countdigit {
    static int numberoftimes(int n, int d)
    {
        int count = 0;
        while (n > 0)
        {
            count = (n % 10 == d) ? count + 1 : count;
            n = n / 10;
        }

        return count;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int digit=sc.nextInt();
        System.out.println(numberoftimes(number,digit));




    }
}
