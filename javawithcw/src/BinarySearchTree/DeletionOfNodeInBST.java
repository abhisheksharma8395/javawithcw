package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DeletionOfNodeInBST {
    public static BinarySearchTreeNode ConstructBST(String[] arr) {
        BinarySearchTreeNode root = new BinarySearchTreeNode(Integer.parseInt(arr[0]));
        Queue<BinarySearchTreeNode> pq = new LinkedList<>();
        pq.add(root);
        int i = 1;
        while (i < arr.length && !pq.isEmpty()) {
            BinarySearchTreeNode temp = pq.poll();
            if (i < arr.length && arr[i] != "n") {
                temp.left = new BinarySearchTreeNode(Integer.parseInt(arr[i]));
                pq.add(temp.left);
            }
            i++;
            if (i < arr.length && arr[i] != "n") {
                temp.right = new BinarySearchTreeNode(Integer.parseInt(arr[i]));
                pq.add(temp.right);
            }
            i++;
        }
        return root;
    }
    public static void DeleteNode(BinarySearchTreeNode root){
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"10", "5", "15", "2", "8", "12", "17"};
        BinarySearchTreeNode root = ConstructBST(arr);
        int target = sc.nextInt();

    }

    public static class BinarySearchTreeNode {
        int val;
        BinarySearchTreeNode left;
        BinarySearchTreeNode right;

        public BinarySearchTreeNode(int val) {
            this.val = val;
        }
    }
}
