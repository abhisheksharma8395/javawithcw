package Backtraking;

import java.util.Scanner;

public class KnightTour {
    public static boolean knightTour(int[][] grid){
        if(grid[0][0]!=0) return false;
        return helper(grid,0,0,0);
    }
    public static boolean helper(int[][] grid,int row,int col,int num){
        int n = grid.length;
        int i,j;
        if(num == (n*n)-1){
            return true;
        }
        // 2 up and 1 right
        i = row - 2;
        j = col + 1;
        if(i>=0 && j<n && grid[i][j]==num+1){
            return helper(grid,i,j,num+1);
        }
        // 2 up and 1 left
        i = row - 2;
        j = col - 1;
        if(i>=0 && j>=0 && grid[i][j]==num+1){
            return helper(grid,i,j,num+1);
        }
        // 2 down and 1 right
        i = row + 2;
        j = col + 1;
        if(i<n && j<n && grid[i][j]==num+1){
            return helper(grid,i,j,num+1);
        }
        // 2 down and 1 left
        i = row + 2;
        j = col - 1;
        if(i<n && j>=0 && grid[i][j]==num+1){
            return helper(grid,i,j,num+1);
        }
        // 2 right and 1 up
        i = row - 1;
        j = col + 2;
        if(i>=0 && j<n && grid[i][j]==num+1){
            return helper(grid,i,j,num+1);
        }
        // 2 right and 1 down
        i = row + 1;
        j = col + 2;
        if(i<n && j<n && grid[i][j]==num+1){
            return helper(grid,i,j,num+1);
        }
        // 2 left and 1 up
        i = row - 1;
        j = col - 2;
        if(i>=0 && j>=0 && grid[i][j]==num+1){
            return helper(grid,i,j,num+1);
        }
        // 2 left and 1 down
        i = row + 1;
        j = col - 2;
        if(i<n && j>=0 && grid[i][j]==num+1){
            return helper(grid,i,j,num+1);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j]=sc.nextInt();
            }
        }
        System.out.println(knightTour(grid));
    }
}
