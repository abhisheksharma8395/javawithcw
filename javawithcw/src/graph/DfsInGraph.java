package graph;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DfsInGraph {
    public static void DfsTraversalInGraph(List<List<Integer>> graph, int current, boolean[] visited) {
        visited[current] = true;
        System.out.print(current + " ");

        for (int neighbour : graph.get(current)) {
            if (!visited[neighbour]) {
                DfsTraversalInGraph(graph, neighbour, visited);
            }
        }
    }
    public static void DFSTraversalInGraphIterative(List<List<Integer>> graph, int current) {
        boolean[] visited = new boolean[graph.size()];
        Stack<Integer> st = new Stack<Integer>();
        st.add(current);
        while (!st.isEmpty()) {
            int temp = st.pop();
            if(!visited[temp]) {
                visited[temp] = true;
                System.out.print(temp + " ");
            }
            for (int neighbour : graph.get(temp)) {
                if (!visited[neighbour]) {
                    st.push(neighbour);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> graph = new ArrayList<>();

        System.out.println("Enter the number of vertices:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number of vertices connected with " + i + "th vertex:");
            int v = sc.nextInt();
            System.out.println("Enter all " + v + " connected vertices:");
            for (int j = 0; j < v; j++) {
                int neighbour = sc.nextInt();
                graph.get(i).add(neighbour);
            }
        }

        boolean[] visited = new boolean[n];
        System.out.println("DFS Traversal starting from node 0:");
        DfsTraversalInGraph(graph, 0, visited);
        DFSTraversalInGraphIterative(graph, 0);
    }
}
