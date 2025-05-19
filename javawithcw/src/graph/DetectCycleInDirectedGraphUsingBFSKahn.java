package graph;

import java.util.*;

public class DetectCycleInDirectedGraphUsingBFSKahn {
    public static boolean detectCycleBFS(List<List<Integer>> graph) {
        int[] Indegree = new int[graph.size()];
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.size(); i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                Indegree[graph.get(i).get(j)]++;
            }
        }
        for (int i = 0; i < graph.size(); i++) {
            if (Indegree[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int temp = q.poll();
            count++;
            for(int i : graph.get(temp)) {
                Indegree[i]--;
                if (Indegree[i] == 0) {
                    q.add(i);
                }
            }
        }
        return count != graph.size(); // If count < total vertices, then a cycle exists
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

        if(detectCycleBFS(graph)) {
            System.out.println("Cycle found");
        }
        else {
            System.out.println("No cycle found");
        }
    }
}
