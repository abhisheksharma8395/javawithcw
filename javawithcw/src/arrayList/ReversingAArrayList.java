package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReversingAArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(10);
        l1.add(3);
        l1.add(5);
        l1.add(22);
        l1.add(10);
        for (int i = 0; i < l1.size()/2; i++) {
            int temp = l1.get(i);
            l1.set(i,l1.get(l1.size()-i-1));
            l1.set(l1.size()-i-1,temp);
        }
        System.out.println(l1);
        Collections.reverse(l1);
        System.out.println(l1);
    }
}
