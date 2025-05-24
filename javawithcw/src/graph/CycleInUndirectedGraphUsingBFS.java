package graph;
import java.util.*;

public class CycleInUndirectedGraphUsingBFS {
    static class Pair{
        int parent;
        int child;
        public Pair(int child, int parent) {
            this.parent = parent;
            this.child = child;
        }
    }
    public static boolean bfsTraversal(List<List<Integer>> graph,int current,boolean[] isVisited){
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(current,-1));
        isVisited[current] = true;
        while(!queue.isEmpty()){
            Pair pair = queue.remove();
            int parent = pair.parent;
            int child = pair.child;
            for (int neighbour : graph.get(child)) {
                if(neighbour == parent) continue;
                else if(isVisited[neighbour]) return true;
                else if(!isVisited[neighbour]){
                    isVisited[neighbour] = true;
                    queue.add(new Pair(neighbour, child));
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
        boolean flag = false;      //some time graph given is disconnected like 0->1 2->3
        boolean[] isVisited = new boolean[graph.size()];
        for (int i = 0; i < graph.size(); i++) {
            if(!isVisited[i] && bfsTraversal(graph,i,isVisited)){
                flag = true;
                break;
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
