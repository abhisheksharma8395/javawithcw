package Backtraking;

import java.util.Scanner;

public class RatInMazeFourDirection {
    private static void printPath(int sr, int sc, int er, int ec, String s) {
        if (sr > er || sc > ec) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
        }
        if (sr < 0 || sc < 0) {
            return;
        }
        printPath(sr + 1, sc, er, ec, s + "D");
        printPath(sr - 1, sc, er, ec, s + "U");
        printPath(sr, sc + 1, er, ec, s + "R");
        printPath(sr, sc - 1, er, ec, s + "L");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int er = sc.nextInt();
        int ec = sc.nextInt();

    }
}
