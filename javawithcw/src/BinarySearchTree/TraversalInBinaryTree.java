package BinarySearchTree;


import java.util.LinkedList;
import java.util.Queue;

public class TraversalInBinaryTree {
    public static class BinarySearchTreeNode{
        int val;
        BinarySearchTreeNode left;
        BinarySearchTreeNode right;
        public BinarySearchTreeNode(int val){
            this.val = val;
        }
    }
    public static void PreorderInBST(BinarySearchTreeNode root){
        if(root==null) return;
        System.out.print(root.val+" ");
        if(root.left!=null) PreorderInBST(root.left);
        if(root.right!=null) PreorderInBST(root.right);
    }
    public static void PostorderInBST(BinarySearchTreeNode root){
        if(root==null) return;
        if(root.left!=null) PostorderInBST(root.left);
        if(root.right!=null) PostorderInBST(root.right);
        System.out.print(root.val+" ");
    }
    public static void InorderInBST(BinarySearchTreeNode root){
        if(root==null) return;
        if(root.left!=null) InorderInBST(root.left);
        System.out.print(root.val+" ");
        if(root.right!=null) InorderInBST(root.right);
    }
    public static void BFSInBST(BinarySearchTreeNode root){
        if(root==null) return;
        Queue<BinarySearchTreeNode> pq = new LinkedList<>();
        pq.add(root);
        while(!pq.isEmpty()){
            BinarySearchTreeNode temp = pq.poll();
            System.out.print(temp.val+" ");
            if(temp.left!=null) pq.add(temp.left);
            if(temp.right!=null) pq.add(temp.right);
        }
    }
    public static BinarySearchTreeNode ConstructBST(String[] arr){
        BinarySearchTreeNode root = new BinarySearchTreeNode(Integer.parseInt(arr[0]));
        Queue<BinarySearchTreeNode> pq = new LinkedList<>();
        pq.add(root);
        int i = 1;
        while(i< arr.length && !pq.isEmpty()){
            BinarySearchTreeNode temp = pq.poll();
            if(i< arr.length && arr[i]!="n"){
                temp.left = new BinarySearchTreeNode(Integer.parseInt(arr[i]));
                pq.add(temp.left);
            }
            i++;
            if(i< arr.length && arr[i]!="n"){
                temp.right = new BinarySearchTreeNode(Integer.parseInt(arr[i]));
                pq.add(temp.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        String[] arr = {"10","5","15","2","8","12","17"};
        BinarySearchTreeNode root = ConstructBST(arr);
        System.out.print("Preorder Traversal of Binary Search Tree is : ");
        PreorderInBST(root);
        System.out.println(" ");
        System.out.print("Postorder Traversal of Binary Search Tree is : ");
        PostorderInBST(root);
        System.out.println(" ");
        System.out.print("Inorder Traversal of Binary Search Tree is : ");
        InorderInBST(root);
        System.out.println(" ");
        System.out.print("Level order Traversal of Binary Search Tree is : ");
        BFSInBST(root);
    }
}
