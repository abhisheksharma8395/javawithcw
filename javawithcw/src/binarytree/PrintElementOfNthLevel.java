package binarytree;

public class PrintElementOfNthLevel {
    public static class BinaryTreeNode{
        int val;
        BinaryTreeNode LeftNode;
        BinaryTreeNode RightNode;
        public BinaryTreeNode(int val){
            this.val = val;
        }
    }
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
        int ht = height(root);
        for (int i = 1; i <= ht; i++) {
            ElementAtNthLevel(root,i,ht);
            System.out.println(" ");
        }
    }
    public static void ElementAtNthLevel(BinaryTreeNode root,int levels,int height){
        if(levels>height){
            return;
        }
        if(root==null) return;
        if(levels == 1){
            System.out.print(root.val + " ");
            return;
        }
        ElementAtNthLevel(root.LeftNode,levels-1,height);
        ElementAtNthLevel(root.RightNode,levels-1,height);
    }
    public static int height(BinaryTreeNode root){
        if(root==null) return 0;
        if(root.LeftNode == null && root.RightNode == null) return 1;
        return 1+Math.max(height(root.LeftNode),height(root.RightNode));
    }
}
