package graph;
import java.util.*;
public class TopologicalSortUsingBFSAndKahnsAlgorithm {
    public static void BFS(List<List<Integer>> graph,int[] Indegree) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < Indegree.length; i++) {
            if(Indegree[i] == 0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node+" ");
            for (int i : graph.get(node)) {
                Indegree[i]--;
                if(Indegree[i] == 0){
                    queue.add(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> graph = new ArrayList<>();
        System.out.println("Enter the number of vertices");
        int n = sc.nextInt();
        int[] Indegree = new int[n];
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            System.out.println("number of vertex connected with "+i+"th vertex");
            int v = sc.nextInt();
            System.out.println("Enter all " + v + " connected vertices:");
            for(int j = 0; j < v; j++){
                int nodes = sc.nextInt();
                graph.get(i).add(nodes);
                Indegree[nodes]++;
            }
        }
        BFS(graph,Indegree);
    }
}
