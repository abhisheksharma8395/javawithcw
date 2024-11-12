package binarytree;

public class ZigZag_Traversal {
    public static class BinaryTreeNode {
        int data;
        BinaryTreeNode LeftNode;
        BinaryTreeNode RightNode;

        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }
    public static int height(BinaryTreeNode root){
        if(root==null) return 0;
        if(root.LeftNode==null && root.RightNode==null){
            return 1;
        }
        return 1+Math.max(height(root.LeftNode),height(root.RightNode));
    }
    public static void ltor(BinaryTreeNode root,int level){
        if(root==null) return;
        if(level==1){
            System.out.print(root.data+" ");
        }
        ltor(root.LeftNode,level-1);
        ltor(root.RightNode,level-1);
    }
    public static void rtol(BinaryTreeNode root,int level){
        if(root==null) return;
        if(level==1){
            System.out.print(root.data+" ");
        }
        ltor(root.RightNode,level-1);
        ltor(root.LeftNode,level-1);
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
        for(int i=1;i<=ht;i++){
            if(i%2!=0){
                ltor(root,i);
            }
            else{
                rtol(root,i);
            }
        }
    }

}
