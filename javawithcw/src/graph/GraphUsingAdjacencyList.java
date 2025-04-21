package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphUsingAdjacencyList {
    public static class Node{
        int id;
        String name;
        public Node(int id,String name){
            this.id = id;
            this.name = name;
        }
    }
    public static class Graph{
        private List<Node> nodes;
        private List<List<Integer>> adjacencyList;
        public Graph(){
            nodes = new ArrayList<>();
            adjacencyList = new ArrayList<>();

        }
        public void addNode(Node node){
            nodes.add(node);
            adjacencyList.add(new ArrayList<>());
        }
        public void addEdge(int i, int j){
            adjacencyList.get(i).add(j);
            adjacencyList.get(j).add(i);
        }
        public void removeEdge(int i, int j){
            adjacencyList.get(i).remove(j);
            adjacencyList.get(j).remove(i);
        }
        public void printGraph(){
            for (int i = 0; i < nodes.size(); i++) {
                System.out.print(nodes.get(i).name+"->");
                for(int j : adjacencyList.get(i)){
                    System.out.print(nodes.get(j).name+" ");
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
        Graph graph = new Graph();
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
            graph.addEdge(fromCityId,toCityId);
            System.out.println(" ");
            System.out.print("If you want to continue write true otherwise false : ");
            flag = sc.nextBoolean();
        }
        System.out.println("Adjacency List is");
        graph.printGraph();
    }
}
