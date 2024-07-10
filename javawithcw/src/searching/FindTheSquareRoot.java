package searching;

import java.util.Scanner;

public class FindTheSquareRoot {
    public static int findTheSquareRoot(int n) {
        int j = 0;
        while (j * j <= n) {
            j++;
        }
        return j - 1;
    }

    public static int findTheSquareRootBinarySearch(int n) {
        int first = 0,last = n;
        int ans = -1;
        while (first<=last) {
            int mid = first+(last-first)/2;
            if(mid*mid == n){
                return mid;
            }
            else if(mid*mid > n){
                last = mid-1;
            }
            else{
                first = mid+1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findTheSquareRoot(n));
        System.out.println(findTheSquareRootBinarySearch(n));
    }
}
