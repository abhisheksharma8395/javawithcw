package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListInAscendingAndDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(10);
        l1.add(3);
        l1.add(5);
        l1.add(22);
        l1.add(10);
        Collections.sort(l1);
        System.out.println(l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);
    }
}
