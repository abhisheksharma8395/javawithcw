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
    public static void delete(BinarySearchTreeNode root,int x){
        if(root.val>x){
            if(root.left==null) return;
            else if(root.left.val==x){
                //0 child node
                if(root.left.left==null && root.left.right==null){
                    root.left = null;
                }
                //1 child node
                else if(root.left.left==null || root.left.right==null){
                    if(root.left.left==null) root.left = root.left.right;
                    else root.left = root.left.left;
                }
                //2 child node
                else{
                    BinarySearchTreeNode current = root.left;
                    BinarySearchTreeNode pred = current.left;
                    while(pred.right!=null){
                        pred=pred.right;
                    }
                    delete(root,pred.val);
                    pred.left = current.left;
                    pred.right = current.right;
                    root.left = pred;
                }
            }
            else delete(root.left,x);
        }
        else{
            if(root.right==null) return;
            else if(root.right.val==x){
                //0 child node
                if(root.right.left==null && root.right.right==null){
                    root.right = null;
                }
                //1 child node
                else if(root.right.left==null || root.right.right==null){
                    if(root.right.left==null) root.right = root.right.right;
                    else root.right = root.right.left;
                }
                //2 child node
                else{
                    BinarySearchTreeNode current = root.right;
                    BinarySearchTreeNode pred = current.right;
                    while(pred.left!=null){
                        pred=pred.left;
                    }
                    delete(root,pred.val);
                    pred.left = current.left;
                    pred.right = current.right;
                    root.right = pred;
                }
            }
            else delete(root.right,x);
        }
    }
    public static BinarySearchTreeNode deleteNode(BinarySearchTreeNode root, int X) {
        BinarySearchTreeNode temp =new BinarySearchTreeNode(Integer.MAX_VALUE);
        temp.left = root;
        delete(temp,X);
        return temp.left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"10", "5", "15", "2", "8", "12", "17"};
        BinarySearchTreeNode root = ConstructBST(arr);
        int target = sc.nextInt();
        deleteNode(root,target);

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
