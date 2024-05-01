package Backtraking;

import java.util.Scanner;

public class MaxKnightsInNXNBoard {
    static int maxKnight = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] chessBoard = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j] = '.';
            }
        }
        helper(chessBoard,0,0,0);
        System.out.println(maxKnight);
    }
    public static void helper(char[][] arr,int row,int col,int num){
        int n = arr.length;
        if(row == n){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println(" ");
            }
            System.out.println(" ");
            maxKnight = Math.max(maxKnight,num);
            return;
        }
        else if(isSafe(arr,row,col)){
            arr[row][col]='K';
            if(col!=n-1) helper(arr,row,col+1,num+1);
            else helper(arr,row+1,0,num+1);
            arr[row][col] = '.';
        }
        if(col!=n-1) helper(arr,row,col+1,num);  //Not Safe
        else helper(arr,row+1,0,num);
    }

    public static boolean isSafe(char[][] grid, int row, int col) {
        int n = grid.length;
        int i, j;
        // 2 up and 1 right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && grid[i][j] == 'K') return false;
        // 2 up and 1 left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && grid[i][j] == 'K') return false;
        // 2 down and 1 right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && grid[i][j] == 'K') return false;
        // 2 down and 1 left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && grid[i][j] == 'K') return false;
        // 2 right and 1 up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && grid[i][j] == 'K') return false;
        // 2 right and 1 down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && grid[i][j] == 'K') return false;
        // 2 left and 1 up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && grid[i][j] == 'K') return false;
        // 2 left and 1 down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && grid[i][j] == 'K') return false;
        return true;
    }
}
