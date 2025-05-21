package graph;

import java.util.*;

public class ShortestPathInUndirectedGraph {
    public static void ShortestPathBFS(List<List<Integer>> graph,int node){
        boolean[] visited = new boolean[graph.size()];
        int[] distance = new int[graph.size()];
        Arrays.fill(distance, -1);
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;
        distance[node] = 0;
        while(!q.isEmpty()){
            int current = q.poll();
            for(int neighbour : graph.get(current)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    distance[neighbour] = distance[current]+1;
                    q.add(neighbour);
                }
            }
        }
        System.out.println("Minimum distance to all node from "+node+" is :");
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(i+"  ");
        }
        System.out.println(" ");
        for (int j : distance) {
            System.out.print(j + "  ");
        }
    }
    public static void ShortestPathDFS(List<List<Integer>> graph,int current, boolean[] visited, int[] distance){
        visited[current] = true;
        for(int neighbour : graph.get(current)){
            if(!visited[neighbour] || distance[current]+1 < distance[neighbour]){
                distance[neighbour] = distance[current]+1;
                ShortestPathDFS(graph,neighbour,visited,distance);
            }
        }
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
            System.out.println("number of vertex connected with " + i + "th vertex");
            int v = sc.nextInt();
            System.out.println("Enter all " + v + " connected vertices:");
            for (int j = 0; j < v; j++) {
                int connectedVertex = sc.nextInt();
                graph.get(i).add(connectedVertex);
                graph.get(connectedVertex).add(i);
            }
        }
        System.out.println("Enter the Node from which you want shortest path for all other nodes");
        int node = sc.nextInt();
        ShortestPathBFS(graph, node);
        boolean[] visited = new boolean[graph.size()];
        int[] distance = new int[graph.size()];
        Arrays.fill(distance, -1);
        distance[node] = 0;
        ShortestPathDFS(graph, node, visited, distance);
        System.out.println("\nDFS - Minimum distance from node " + node + " :");
        for (int i = 0; i < n; i++) {
            System.out.println("Node " + i + ": " + distance[i]);
        }
    }
}
