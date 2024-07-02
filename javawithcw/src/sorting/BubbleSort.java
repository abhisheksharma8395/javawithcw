package sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void Bsort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void BubbbleeSort(int[] array,int idx){
        if(idx==array.length-1){
            return;
        }
        for(int i = 0;i< array.length-idx-1;i++){
            if(array[i]>array[i+1]){
                int temp = array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            }

        }
        BubbbleeSort(array,idx+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        BubbbleeSort(array,0);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
