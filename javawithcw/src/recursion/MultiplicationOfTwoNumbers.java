package recursion;

import java.util.Scanner;

public class MultiplicationOfTwoNumbers {
    public static int multiplicationbyrecursion(int val1,int val2){
        if(val2==1){
            return val1;
        }
        return multiplicationbyrecursion(val1,val2-1)+val1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        System.out.println(multiplicationbyrecursion(val1,val2));
    }

}
