package recursion;
import java.util.Scanner;
public class SumOfTheArrayByUsingRecursion {
    private static int sumofarray(int[] arr,int idx){
        //Base Case
        if(idx == arr.length-1){
            return arr[idx];
        }
        //Subproblems + Self Work
        return sumofarray(arr,idx+1)+arr[idx];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(sumofarray(arr,0));
    }
}
