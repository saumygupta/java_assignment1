import java.util.*;
public class inversenumber {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=(int)Math.log10(n)+1;
        int sum=0;
        for(int i=1;i<=l;i++){
            int rem=n%10;
            int f=i*(int)Math.pow(10,(rem-1));
            sum=sum+f;
            n=n/10;
        }
        System.out.println(sum);
    }
}

