package sorting;

import java.util.Scanner;

public class NegativesBeforePositives {
    public static void negativeBeforePositives(int[] array) {
        int i = 0;
        int j = array.length-1;
        while (i<j){
            while(array[i]<0){
                i++;
            }
            while(array[j]>0){
                j--;
            }
            if(i<j){                    // Swapping elements
                swap(array,i,j);
            }
        }
    }

    public static void swap(int[] array, int firstIndex, int SecondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[SecondIndex];
        array[SecondIndex] = temp;
    }

    public static void Display(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        negativeBeforePositives(array);
        Display(array);
    }
}
