package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BucketSort {
    public static void BucketSortAlgo(float[] array){
        int n = array.length;
        ArrayList<Float>[] Buckets = new ArrayList[n];
        //adding arraylist at every index of Buckets array
        for (int i = 0; i < n; i++) {
            Buckets[i] = new ArrayList<>();
        }
        //Filling the array Buckets
        for (float i : array) {
            int BucketIndex = (int)i*n;
            Buckets[BucketIndex].add(i);
        }
        // Sorting every bucket in Bucket in Buckets array
        for (ArrayList<Float> Bucket : Buckets) {
            Collections.sort(Bucket);
        }
        //Putting all Elements of Bucket in array
        int index = 0;
        for (ArrayList<Float> ans : Buckets){
            for (float j : ans){
                array[index++] = j;
            }
        }
    }
    public static void Display(float[] array){
        for(float i : array){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] array = new float[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextFloat();
        }
        BucketSortAlgo(array);
        Display(array);
    }
}
