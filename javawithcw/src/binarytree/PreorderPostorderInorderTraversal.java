package binarytree;

public class PreorderPostorderInorderTraversal {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode a = new BinaryTreeNode(2);
        BinaryTreeNode b = new BinaryTreeNode(3);
        BinaryTreeNode c = new BinaryTreeNode(4);
        BinaryTreeNode d = new BinaryTreeNode(5);
        BinaryTreeNode e = new BinaryTreeNode(6);
        BinaryTreeNode f = new BinaryTreeNode(7);
        root.LeftNode = a;
        root.RightNode = b;
        a.LeftNode = c;
        a.RightNode = d;
        b.LeftNode = e;
        b.RightNode = f;
        preorder(root);
        System.out.println(" ");
        inorder(root);
        System.out.println(" ");
        postorder(root);
    }
    public static void preorder(BinaryTreeNode root){
        //preorder is root left right
        if(root==null) return;
        System.out.print(root.data+",");
        preorder(root.LeftNode);
        preorder(root.RightNode);
    }
    public static void inorder(BinaryTreeNode root){
        //preorder is left root right
        if(root==null) return;
        inorder(root.LeftNode);
        System.out.print(root.data+",");
        inorder(root.RightNode);
    }
    public static void postorder(BinaryTreeNode root){
        //postorder is left right root
        if(root==null) return;
        postorder(root.LeftNode);
        postorder(root.RightNode);
        System.out.print(root.data+",");
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
