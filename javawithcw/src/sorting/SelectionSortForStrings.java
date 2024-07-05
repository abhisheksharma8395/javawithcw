package sorting;

import java.util.Scanner;

public class SelectionSortForStrings {
    public static void SSortString(String[] array){
        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j <array.length ; j++) {
                if(array[min].compareTo(array[j])>0){
                   min = j;
                }
            }
            String s = array[min];
            array[min] = array[i];
            array[i] = s;
        }
        for(String i : array){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
        }
        SSortString(array);
    }
}
