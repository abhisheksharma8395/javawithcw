package Backtraking;

import java.util.Scanner;

public class RatInMazeFourDirection {
    private static void printPath(int sr, int sc, int er, int ec, String s, Boolean[][] arr) {
        if (sr > er || sc > ec) {
            return;
        }
        if (sr < 0 || sc < 0) {
            return;
        }
        if(arr[sr][sc]){
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        arr[sr][sc]=true;
        printPath(sr + 1, sc, er, ec, s + "D", arr);
        printPath(sr - 1, sc, er, ec, s + "U", arr);
        printPath(sr, sc + 1, er, ec, s + "R", arr);
        printPath(sr, sc - 1, er, ec, s + "L", arr);
        arr[sr][sc]=false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int er = sc.nextInt();
        int ec = sc.nextInt();
        Boolean[][] arr = new Boolean[er][ec];
        for (int i = 0; i < er; i++) {
            for (int j = 0; j < ec; j++) {
                arr[i][j]=false;
            }
        }
        printPath(0,0,er-1,ec-1,"",arr);
    }
}
