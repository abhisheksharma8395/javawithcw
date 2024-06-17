package arrays.questions;
import java.util.Scanner;

public class FindUniqueNumber {
    public static void UniqueNumber(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n ; j++) {
                if(array[i]==array[j]){
                    array[i]=-1;
                    array[j]=-1;
                }
            }
        }
        for (int i : array) {
            if(i>0){
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[7];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.print("Unique number's in array are [O(n^2) : ");
        UniqueNumber(Array);

    }
}
