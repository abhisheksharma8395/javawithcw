package Backtraking;

import java.util.Scanner;

public class RatInMazeTwoDirection {
    private static void printWays(int sr, int sc, int er, int ec, String s) {
        if (sr > er || sc > ec) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
        }
        printWays(sr + 1, sc, er, ec, s + "D");
        printWays(sr, sc + 1, er, ec, s + "R");
    }

    private static int countWays(int sr, int sc, int er, int ec, int sum) {
        if (sr > er || sc > ec) {
            return 0;
        }
        if (sr == er && sc == ec) {
            return 1;
        }
        int downways = countWays(sr + 1, sc, er, ec, sum);
        int rightways = countWays(sr, sc + 1, er, ec, sum);
        return downways+rightways;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int er = sc.nextInt();
        int ec = sc.nextInt();
        System.out.print("Total number of Ways : ");
        System.out.println(countWays(1, 1, er, ec, 0));
        printWays(1, 1, er, ec, "");

    }
}
