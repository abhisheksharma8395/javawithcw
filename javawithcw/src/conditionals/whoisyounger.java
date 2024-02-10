package conditionals;

import java.util.Scanner;

public class whoisyounger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rohit age");
        int a=sc.nextInt();
        System.out.println("Enter the john age");
        int b=sc.nextInt();
        System.out.println("Enter the ajay age");
        int c=sc.nextInt();
        if (a<b && a<c){
            System.out.println("Rohit is younger");
        }
        else if(b<a && b<c){
            System.out.println("John is younger");
        }
        else if(c<a && c<b){
            System.out.println("Ajay is younger");
        }
        else{
            System.out.println("They have same age");
        }
    }
}
