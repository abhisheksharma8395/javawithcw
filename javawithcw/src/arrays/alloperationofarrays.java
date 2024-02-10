package arrays;
import java.util.Arrays;
import java.util.Scanner;
class Algebraofarrays{
    void arraysum(int[] arr){
        int sum=0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println(sum);
    }
    void arraymax(int[] arr){
        int max=0;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println(max);
    }
    void arraymin(int[] arr){
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
    void searchfirstoccurenceindex(int[] arr,int x){
        int pos=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                pos=i;
                break;
            }
        }
        System.out.println(pos);
    }
    void greatervariablethan(int[] arr,int x){
        int count=0;
        for (int j : arr) {
            if (j > x) {
                count += 1;
            }
        }
        System.out.println(count);
    }
    void sortingarray(int[] arr){
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

}
public class alloperationofarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Algebraofarrays obj1=new Algebraofarrays();
        System.out.println("Enter the number of Element in Array:");
        int x=sc.nextInt();

        int[] arr1=new int[x];
        for(int j=0;j<x;j++){
            System.out.println("Enter the "+(j+1)+" element of array");
            arr1[j]=sc.nextInt();
        }
        System.out.println("Enter the Element you want to find in Array:");
        int y=sc.nextInt();
        System.out.println("Enter the Element you want to count greater than variables in Array:");
        int z=sc.nextInt();
        System.out.print("Sum of array Elemnts is:");
        obj1.arraysum(arr1);
        System.out.print("Greatest Elemnts of array is:");
        obj1.arraymax(arr1);
        System.out.print("Smallest Elemnts of array is:");
        obj1.arraymin(arr1);
        System.out.print("the index of Elemnts "+y+" in array is:");
        obj1.searchfirstoccurenceindex(arr1,y);
        System.out.print("variables greater than "+z+" in array is:");
        obj1.greatervariablethan(arr1,z);
        System.out.print("Sorted array is:");
        obj1.sortingarray(arr1);
    }
}
