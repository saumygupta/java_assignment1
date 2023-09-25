import java.util.*;
public class conversion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int min=sc.nextInt();
        int max=sc.nextInt();
        int step=sc.nextInt();
        for(int i=min;i<=max;i+=step){
            int convert=(int)((5.0/9.0)*(i-32));
            System.out.println(i+"\t"+convert);
        }
    }
}