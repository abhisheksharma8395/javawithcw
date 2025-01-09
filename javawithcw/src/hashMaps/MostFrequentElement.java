package hashMaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentElement {
    public static int getMostFrequentElement(int[] arr) {          //O(2n)
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        int maxFreq = -1;
        int ans = -1;
        for (int key : map.keySet()) {
            if(maxFreq < map.get(key)) {
                maxFreq = map.get(key);
                ans = key;
            }
        }
        return ans;
    }
    public static int getMostFrequentElement1(int[] arr) {                    //O(nlogn)
        int[] arr1;
        arr1 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr1);
        int max_freq = 0;
        int most_frequent = 0;
        int freq = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr1[i] == arr1[i+1]) {
                freq++;
            }
            if(freq > max_freq) {
                max_freq = freq;
                most_frequent = arr1[i];
            }
        }
        return most_frequent;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(getMostFrequentElement(arr));
        System.out.println(getMostFrequentElement1(arr));
    }
}
