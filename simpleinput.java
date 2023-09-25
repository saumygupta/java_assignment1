import java.util.*;
public class simpleinput {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int cumulativeSum = 0;

        while (true) {
            try {
                int num = sc.nextInt();
                numbers.add(num);
                cumulativeSum += num;

                if (cumulativeSum < 0) {
                    break;
                }
            } catch (java.util.InputMismatchException e) {

                System.out.println("Invalid input. Please enter an integer.");
                sc.nextLine();
            }
        }

        for (int j=0;j<numbers.size()-1;j++) {
            System.out.println(numbers.get(j));
        }
    }}
