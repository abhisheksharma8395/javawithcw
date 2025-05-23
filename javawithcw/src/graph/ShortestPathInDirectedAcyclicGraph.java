package graph;

import java.util.*;
// find topological sort
// remove element from stack of topological sort
//and update the distance of neighbour of element by distance[neighbour] = Math.min(distance[neighbour],weightOfEdge(element,neighbour)+distance[current])
public class ShortestPathInDirectedAcyclicGraph {
    public static class Pair{
        int vertex;
        int weight;
        public Pair(int v, int w){
            vertex = v;
            weight = w;
        }
    }
    public static void topoSortDFS(List<List<Pair>> graph, int node,boolean[] visited,Stack<Integer> stack){
        visited[node] = true;
        for(Pair pair : graph.get(node)){
            int neighbour = pair.vertex;
            if(!visited[neighbour]){
                topoSortDFS(graph, neighbour, visited, stack);
            }
        }
        stack.push(node);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Pair>> graph = new ArrayList<>();
        System.out.println("Enter the number of vertices");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            System.out.println("number of vertex connected with " + i + "th vertex");
            int v = sc.nextInt();
            System.out.println("Enter all " + v + " connected vertices ans their weights respectively:");
            for (int j = 0; j < v; j++) {
                int connectedVertex = sc.nextInt();
                int weight = sc.nextInt();
                graph.get(i).add(new Pair(connectedVertex,weight));
            }
        }
        System.out.println("Enter the Node from which you want shortest path for all other nodes");
        int node = sc.nextInt();
        boolean[] visited = new boolean[n];
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        Stack<Integer> stack = new Stack<>();
        distance[node] = 0;
        topoSortDFS(graph, node, visited, stack);
        while(!stack.isEmpty()){
            int current = stack.pop();
            for(Pair pair : graph.get(current)){
                int neighbour = pair.vertex;
                int weight = pair.weight;
                distance[neighbour] = Math.min(distance[neighbour],distance[current]+weight);
            }
        }
        for (int d : distance) {
            System.out.print((d == Integer.MAX_VALUE ? -1 : d) + " ");
        }
    }
}
