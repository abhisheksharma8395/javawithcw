package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class TopologicalSortUsingDFS {
    public static void DFS(List<List<Integer>> graph,int currentVertex,boolean[] visited,Stack<Integer> stack) {
        visited[currentVertex] = true;
        for (int i : graph.get(currentVertex)) {
            if (!visited[i]) {
                DFS(graph, i, visited, stack);
            }
        }
        stack.push(currentVertex);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> graph = new ArrayList<>();
        System.out.println("Enter the number of vertices");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            System.out.println("number of vertex connected with "+i+"th vertex");
            int v = sc.nextInt();
            System.out.println("Enter all " + v + " connected vertices:");
            for(int j = 0; j < v; j++){
                graph.get(i).add(sc.nextInt());
            }
        }
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                DFS(graph, i, visited, stack);
            }
        }
        System.out.println("Topological sort of the graph : ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
