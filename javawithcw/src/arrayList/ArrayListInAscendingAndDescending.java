package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListInAscendingAndDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
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
        l2.add("Welcome");
        l2.add("To");
        l2.add("PW");
        l2.add("Skills");
        System.out.println("Original List "+l2);
        Collections.sort(l2);
        System.out.println("List Sorted in Ascending Order "+l2);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("List Sorted in Descending Order "+l2);
    }
}
