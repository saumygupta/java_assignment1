import java.util.*;
public class replacethemall {
    static int convert0To5Rec(int num)
    {
        if (num == 0)
            return 0;


        int digit = num % 10;
        if (digit == 0)
            digit = 5;


        return convert0To5Rec(num / 10) * 10 + digit;
    }
    static int convert0To5(int num)
    {
        if (num == 0)
            return 5;
        else
            return convert0To5Rec(num);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(convert0To5(n));


    }
}