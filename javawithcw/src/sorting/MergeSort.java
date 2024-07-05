package sorting;

import java.util.Scanner;

public class MergeSort {
    public static void MergeSortR(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        int mid = (left+right)/2;
        MergeSortR(array,left,mid);
        MergeSortR(array,mid+1,right);
        Merge(array,left,mid,right);
    }
    public static void Merge(int[] array,int left,int mid,int right){
        int n1 = mid-left+1;
        int n2 = right-mid;
        int[] lefty = new int[n1];
        int[] righty = new int[n2];
        int i,j,k;
        for (i = 0; i < n1; i++) {
            lefty[i] = array[left+i];
        }
        for (i = 0; i < n2; i++) {
            righty[i] = array[mid+1+i];
        }
        i=0;
        j=0;
        k=left;
        while(i< n1 && j<n2){
            if(lefty[i]<righty[j]){
                array[k++]=lefty[i++];
            }
            else {
                array[k++]=righty[j++];
            }
        }
        while(i<n1){
            array[k++]=lefty[i++];
        }
        while(j<n2){
            array[k++]=righty[j++];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        MergeSortR(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
