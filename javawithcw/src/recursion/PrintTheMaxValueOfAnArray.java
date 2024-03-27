package recursion;
import java.util.Scanner;
public class PrintTheMaxValueOfAnArray {
    private static int maxofarrbyrecursion(int[] arr,int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int maxanswer = maxofarrbyrecursion(arr,idx+1);
        return Math.max(arr[idx],maxanswer);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(maxofarrbyrecursion(arr,0));


    }
}
