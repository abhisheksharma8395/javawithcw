package sorting;

import java.util.Scanner;
public class MoveAllZeroToEnd{
    public static void Bsort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length; j++) {
                if(array[j]==0 && array[j+1]!=0){
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
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        Bsort(array);
    }
}
