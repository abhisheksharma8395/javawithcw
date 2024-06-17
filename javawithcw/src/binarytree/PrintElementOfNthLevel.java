package binarytree;

public class PrintElementOfNthLevel {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode a = new BinaryTreeNode(7);
        BinaryTreeNode b = new BinaryTreeNode(9);
        BinaryTreeNode c = new BinaryTreeNode(2);
        BinaryTreeNode d = new BinaryTreeNode(6);
        BinaryTreeNode e = new BinaryTreeNode(9);
        BinaryTreeNode f = new BinaryTreeNode(5);
        BinaryTreeNode g = new BinaryTreeNode(5);
        BinaryTreeNode h = new BinaryTreeNode(11);
        root.LeftNode = a;
        root.RightNode = b;
        a.LeftNode = c;
        a.RightNode = d;
        b.RightNode = e;
        e.LeftNode = f;
        d.LeftNode = g;
        d.RightNode = h;
        int n = height(root)+1;
        System.out.println(n);
        for (int i = 1; i <=n; i++) {
            Nthlevel(root,i);
            System.out.println(" ");
        }

    }
    public static int height(BinaryTreeNode root){
        if(root==null ||(root.LeftNode==null && root.RightNode==null)) return 0;
        return 1+Math.max(height(root.LeftNode),height(root.RightNode));
    }
    public static void Nthlevel(BinaryTreeNode root,int n){
        if (root==null) return;
        if(n==1){
            System.out.print(root.data+" ");
            return;
        }
        Nthlevel(root.LeftNode,n-1);
        Nthlevel(root.RightNode,n-1);
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
