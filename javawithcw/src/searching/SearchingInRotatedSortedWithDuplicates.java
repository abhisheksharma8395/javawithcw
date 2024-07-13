package searching;
import java.util.Scanner;
public class SearchingInRotatedSortedWithDuplicates {
    public static int SearchWithDuplicates(int[] array,int target){
        int low = 0;
        int high = array.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(array[mid]==target){
                return mid;
            }
            else if(array[low] == array[mid] && array[mid] == array[high]){
                low++;
                high--;
            }
            else if(array[mid] <= array[high]){
                if(array[mid]<target && array[high] >= target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            else{
                if(array[low]<=target && array[mid]>target){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(SearchWithDuplicates(array,target));
    }
}
