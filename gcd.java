import java.util.*;
public class gcd {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int gdb=0;
        int n2=sc.nextInt();
        int min_num=Math.min(n1,n2);
        for(int i=1;i<=min_num;i++){
            if(n1%i==0 && n2%i==0){
                gdb=i;
            }

        }
        System.out.println(gdb);

    }
}
