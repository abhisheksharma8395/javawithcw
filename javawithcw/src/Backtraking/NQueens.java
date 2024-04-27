package Backtraking;

import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] chessBoard = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j]='.';
            }
        }
        nqueens(chessBoard,0);
    }
    public static void nqueens(char[][] arr,int row){
        int n = arr.length;
        if(row==n){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println(" ");
            }
            System.out.println(" ");
            return;
        }

        for (int j = 0; j < n ; j++) {
            if(isSafe(arr,row,j)){
                arr[row][j]='Q';
                nqueens(arr,row+1);
                arr[row][j]='.';
            }
        }
    }
    public static boolean isSafe(char [][] array,int row,int col){
        int n = array.length;
        //is queen present in rows
        for (int j = 0; j < n; j++) {
            if(array[row][j]=='Q') return false;
        }
        //check for columns

        //is queen present in columns
        for (int i = 0;i < n; i++) {
            if(array[i][col]=='Q') return false;
        }
        //check for NorthEast direction
        int i =row;
        int j = col;
        while(i>=0 && j<n){
            if(array[i][j]=='Q') return false;
            i--;
            j++;
        }
        //check for SouthEast direction
        i =row;
        j = col;
        while(i<n && j<n){
            if(array[i][j]=='Q') return false;
            i++;
            j++;
        }
        //check for NorthWest direction
        i =row;
        j = col;
        while(i>=0 && j>=0){
            if(array[i][j]=='Q') return false;
            i--;
            j--;
        }
        //check for SouthWest direction
        i =row;
        j = col;
        while(i<n && j>=0){
            if(array[i][j]=='Q') return false;
            i++;
            j--;
        }
        return true;
    }
}
