package binarytree;

public class ImplementationOfBinaryTree {

    static int size = 0;
    public static class BinaryTreeNode {
        int data;
        BinaryTreeNode LeftNode;
        BinaryTreeNode RightNode;
        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }
    public static void display(BinaryTreeNode root){
        if (root == null) return;
        System.out.print(root.data+" -> ");
        if(root.LeftNode != null)  System.out.print(root.LeftNode.data+",");
        else System.out.print("null ,");
        if(root.RightNode!=null)   System.out.println(root.RightNode.data);
        else System.out.println("null");
        display(root.LeftNode);
        display(root.RightNode);
    }
    public static int findMax(BinaryTreeNode root){
        if(root==null) return 0;
        return Math.max(root.data,Math.max(findMax(root.LeftNode),findMax(root.RightNode)));
    }
    public static void size(BinaryTreeNode root) {
        if (root == null) return;
        size = size + 1;
        size(root.LeftNode);
        size(root.RightNode);
    }
    public static int sizeAdvanced(BinaryTreeNode root){
        if (root==null) return 0;
        return 1+sizeAdvanced(root.LeftNode)+sizeAdvanced(root.RightNode);
    }
    public static int sumOfNodes(BinaryTreeNode root){
        if(root==null) return 0;
        return root.data+sumOfNodes(root.LeftNode)+sumOfNodes(root.RightNode);
    }
    public static int height(BinaryTreeNode root){
        if(root==null) return 0;
        return 1+Math.max(height(root.LeftNode),height(root.RightNode));
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(2);
        BinaryTreeNode a = new BinaryTreeNode(4);
        BinaryTreeNode b = new BinaryTreeNode(10);
        BinaryTreeNode c = new BinaryTreeNode(6);
        BinaryTreeNode d = new BinaryTreeNode(5);
        BinaryTreeNode e = new BinaryTreeNode(11);
        root.LeftNode = a;
        root.RightNode = b;
        a.LeftNode = c;
        a.RightNode = d;
        b. RightNode = e;
        display(root);
        size(root);
        System.out.println(size);
        System.out.println(sizeAdvanced(root));
        System.out.println(sumOfNodes(root));
        System.out.println(height(root));
        System.out.println(findMax(root));
    }
}
