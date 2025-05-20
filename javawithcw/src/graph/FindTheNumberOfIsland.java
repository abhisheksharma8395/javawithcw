package graph;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class FindTheNumberOfIsland {
    public static class Pair {
        int row;
        int col;
        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    public static boolean isValid(char[][] matrix,int row, int col) {
        return (row>=0 && row<matrix.length && col>=0 && col<matrix[0].length);
    }
    public static int numberOfIslandsBFS(char[][] grid) {
        int count = 0;
        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    grid[i][j] = '0';
                    queue.add(new Pair(i, j));
                    count++;
                    while (!queue.isEmpty()) {
                        Pair pair = queue.poll();
                        int row = pair.row;
                        int col = pair.col;
                        int[] r = {-1,0,1,0,1,-1,-1,1};        // 8 direction
                        int[] c = {0,-1,0,1,1,-1,1,-1};
                        for (int k = 0; k < 8; k++) {
                            if(isValid(grid,row+r[k],col+c[k])){
                                if(grid[row+r[k]][col+c[k]]=='1'){
                                    grid[row+r[k]][col+c[k]]='0';
                                    queue.add(new Pair(row+r[k],col+c[k]));
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
    public static int numberOfIslandsDFS(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j); // sink the island
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(char[][] grid, int row, int col) {
        grid[row][col] = '0';
        int[] dr = {-1, 0, 1, 0, 1, -1, -1, 1};
        int[] dc = {0, -1, 0, 1, 1, -1, 1, -1};
        for(int i = 0; i < 8; i++) {
            if(isValid(grid,row+dr[i],col+dc[i])){
                if(grid[row+dr[i]][col+dc[i]]=='1'){
                    dfs(grid,row+dr[i],col+dc[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int columns = sc.nextInt();
        if (rows == 0 || columns == 0) {
            System.out.println("Invalid input. Matrix cannot have zero rows or columns.");
            return;
        }
        char[][] matrix = new char[rows][columns];
        System.out.println("Enter the matrix row by row (only 0 & 1):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        //input matrix should contain 0 & 1 only
        //0 represents water
        // 1 represents land
        char[][] matrixBFS = new char[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {                          // copying matrix for BFS operation
            System.arraycopy(matrix[i], 0, matrixBFS[i], 0, matrix[0].length);
        }
        System.out.println("Number of Islands By BFS : "+numberOfIslandsBFS(matrixBFS));
        System.out.println("Number of Islands DFS : "+numberOfIslandsDFS(matrix));
    }
}
