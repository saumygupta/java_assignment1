import java.util.*;
public class fibnnacoi{
    public static int fibonaci(int num)
    {
        if (num==0)
            return 0;
        else if(num==1 || num==2)
            return 1;
        return fibonaci(num - 1) + fibonaci(num - 2);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibonaci(n));

    }
}