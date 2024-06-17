package arrays.questions;

import java.util.Scanner;

public class ElementPresentQueries {
    public static int[] FrequencyArray(int[] array){
        int[] Frequency = new int[100001];
        for (int i : array) {
            Frequency[i]++;
        }
        return Frequency;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        int[] frequency = FrequencyArray(Array);
        System.out.println(" Enter the number of queries : ");
        int K = sc.nextInt();
        while(K>0){
            System.out.println("Enter the Element you want to search :");
            int q = sc.nextInt();
            if(frequency[q]>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            K--;
        }
    }
}
