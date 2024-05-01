package binarytree;

public class PreorderPostorderInorderTraversal {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode a = new BinaryTreeNode(4);
        BinaryTreeNode b = new BinaryTreeNode(7);
        BinaryTreeNode c = new BinaryTreeNode(2);
        BinaryTreeNode d = new BinaryTreeNode(5);
        BinaryTreeNode e = new BinaryTreeNode(8);
        BinaryTreeNode f = new BinaryTreeNode(9);
        root.LeftNode = a;
        root.RightNode = b;
        a.LeftNode = c;
        a.RightNode = d;
        b.RightNode = e;
        e.LeftNode = f;
        preorder(root);
    }
    public static void preorder(BinaryTreeNode root){
        if(root==null) return;
        System.out.print(root.data+",");
        preorder(root.LeftNode);
        preorder(root.RightNode);
    }

    public static class BinaryTreeNode {
        int data;
        BinaryTreeNode LeftNode;
        BinaryTreeNode RightNode;

        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }
}
