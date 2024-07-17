package searching;

import java.util.Scanner;

public class DistributeChocolates {
    public static boolean IsDistributionPossible(int[] array,int student,int mid){
        int StudentCount = 1;
        int chocolates = 0;
        for (int j : array) {
            if (j > mid) return false;
            else if (chocolates + j <= mid) {
                chocolates += j;
            } else {
                StudentCount++;
                chocolates = j;
            }
        }
        return StudentCount <= student;
    }

    public static int distributeChocolate(int[] array, int student) {
        if (array.length < student) return -1;
        int low = 1, high = (int)1e9, ans = 0;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(IsDistributionPossible(array,student,mid)){
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int student = sc.nextInt();
        System.out.println(distributeChocolate(array, student));
    }
}
