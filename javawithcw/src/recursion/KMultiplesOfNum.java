package recursion;

import java.util.Scanner;

public class KMultiplesOfNum {
    public static void kmultipleofnum(int val,int noofmultiples){  //5 4
        //Base case
        if(noofmultiples==1){
            System.out.print(val*noofmultiples+" ");
            return;
        }
        //Subproblems
        kmultipleofnum(val,noofmultiples-1);  //5 10 15
        //self work
        System.out.print(val*noofmultiples+" ");  //20
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        int noofmultiples = scanner.nextInt();
        kmultipleofnum(val,noofmultiples);
    }
}
