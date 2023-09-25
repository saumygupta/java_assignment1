import java.util.*;
public class checkprime{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int prime=sc.nextInt();
        int flag=0;

        for(int i=2;i<prime;i++){
            if(prime==2){
                flag=1;
                break;}
            if(prime%i!=0)
                flag=1;
            else
                flag=0;

        }
        if(flag==0)
            System.out.println("Not Prime");
        else if(flag==1)
            System.out.println("Prime");

    }
}
