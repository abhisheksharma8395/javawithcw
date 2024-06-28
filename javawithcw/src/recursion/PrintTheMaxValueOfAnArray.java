package recursion;
import java.util.Scanner;
public class PrintTheMaxValueOfAnArray {
    private static int MaxOfArrayByRecursion(int[] arr,int idx){
        if(idx==arr.length-1){     // Base Case
            return arr[idx];
        }
        return Math.max(arr[idx],MaxOfArrayByRecursion(arr,idx+1)); //Self Work + Recursive Case
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(MaxOfArrayByRecursion(arr,0));
    }
}
