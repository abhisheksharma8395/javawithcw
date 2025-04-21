package graph;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GraphUsingAdjacencyMatrix {
    public static class Node{
        int id;
        String name;
        public Node(int id,String name){
            this.id = id;
            this.name = name;
        }
    }
    public static class Graph{
        public List<Node> nodes;
        int[][] adjacencyMatrix;
        int numberOfNodes;
        public Graph(int numberOfNodes){
            this.numberOfNodes = numberOfNodes;
            nodes = new ArrayList<>();
            adjacencyMatrix = new int[numberOfNodes][numberOfNodes];
        }
        public void addNode(Node node){
            nodes.add(node);
        }
        public void addEdge(int i,int j,int weight){
            adjacencyMatrix[i][j] = weight;
            adjacencyMatrix[j][i] = weight;
        }
        public void removeEdge(int i,int j){
            adjacencyMatrix[i][j] = 0;
            adjacencyMatrix[j][i] = 0;
        }
        public void printGraph(){
            System.out.print(" ");
            for(int i = 0;i<numberOfNodes;i++){
                System.out.print(nodes.get(i).name+" ");
            }
            System.out.println();
            for(int i = 0;i<numberOfNodes;i++){
                System.out.print(nodes.get(i).name+" ");
                for(int j = 0;j<numberOfNodes;j++){
                    System.out.print(adjacencyMatrix[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Cities : ");
        int numberOfNodes = sc.nextInt();
        System.out.println(" ");
        Graph graph = new Graph(numberOfNodes);

        for(int i = 0;i<numberOfNodes;i++){
            System.out.print("Enter the name of "+i+"th city: ");
            graph.addNode(new Node(i,sc.next()));
        }
        System.out.print("Want to add edges in Graph ");
        boolean flag = sc.nextBoolean();
        for(int i = 0;i<numberOfNodes;i++){
            System.out.println(graph.nodes.get(i).id+"->"+graph.nodes.get(i).name);
        }
        while(flag){
            System.out.print("Enter the from city id and to city id and Distance between them respectively: ");
            int fromCityId = sc.nextInt();
            int toCityId = sc.nextInt();
            int distance = sc.nextInt();
            graph.addEdge(fromCityId,toCityId,distance);
            System.out.println(" ");
            System.out.print("If you want to continue write true otherwise false : ");
            flag = sc.nextBoolean();
        }
        System.out.println("Adjacency Matrix is ");
        graph.printGraph();
    }
}
