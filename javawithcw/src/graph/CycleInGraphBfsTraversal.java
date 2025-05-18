package graph;
import java.util.*;

public class CycleInGraphBfsTraversal {
    static class Pair{
        int parent;
        int child;
        public Pair(int parent, int child) {
            this.parent = parent;
            this.child = child;
        }
    }
    public static boolean bfsTraversal(List<List<Integer>> graph, Queue<Pair> queue,boolean[] isVisited){
        while(!queue.isEmpty()){
            Pair pair = queue.remove();
            int parent = pair.parent;
            int child = pair.child;
            for (int neighbour : graph.get(child)) {
                if(neighbour == parent) continue;
                else if(isVisited[neighbour]) return true;
                else{
                    isVisited[neighbour] = true;
                    queue.add(new Pair(child, neighbour));
                }
            }
        }
        return false;
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
        boolean[] visited = new boolean[n];
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                visited[i] = true;
                Queue<Pair> queue = new LinkedList<>();
                queue.add(new Pair(-1, i));
                if(bfsTraversal(graph,queue,visited)){
                    flag = true;
                }
            }
        }
        if(flag){
            System.out.println("Cycle found");
        }
        else{
            System.out.println("Cycle not found");
        }
    }
}
