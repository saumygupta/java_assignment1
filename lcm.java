import java.util.*;
public class lcm {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int lcm=0;
        int max=Math.max(n,m);
        int min=Math.min(n,m);
        for(int i=1;i<=min;i++){
            lcm=max*i;
            if(lcm % min==0)
                break;

        }
        System.out.println(lcm);




    }
}


