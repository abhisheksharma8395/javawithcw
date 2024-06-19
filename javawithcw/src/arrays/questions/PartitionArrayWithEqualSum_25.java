package arrays.questions;
import java.util.Scanner;

public class PartitionArrayWithEqualSum_25 {
    public static boolean ArrayWithEqualSum(int[] array) {
        int n = array.length;
        int[] PrefixArray = new int[n];
        int[] SuffixArray = new int[n];
        PrefixArray[0] = array[0];
        SuffixArray[n-1] = array[n-1];
        for (int i = 1; i < n; i++) {
            PrefixArray[i] = PrefixArray[i-1] + array[i];
        }
        for (int i = n-2; i >= 0; i--) {
            SuffixArray[i] = SuffixArray[i+1] + array[i];
        }
        for (int i = 1; i < n-1; i++) {
            if(PrefixArray[i]==SuffixArray[i+1]){
                return true;
            }
        }
        return false;
    }
    public static boolean ArrayWithEqualSumInLessTImeComplexity(int[] array) {
        int totalsum = 0 ;
        for(int i : array){
            totalsum += i;
        }
        int PrefixSum = 0;
        for (int i : array) {
            PrefixSum += i;
            int SuffixSum = totalsum - PrefixSum;
            if (SuffixSum == PrefixSum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.println("Can we partition the array into two subarray with equal sum O(3n): "+ArrayWithEqualSum(Array));
        System.out.println("Can we partition the array into two subarray with equal sum O(3n): "+ArrayWithEqualSumInLessTImeComplexity(Array));
    }
}
