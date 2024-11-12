package binarytree;

import java.util.*;

public class BoundaryTraversalAndAllView {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    public static class Pair{
        TreeNode node;
        int hd;
        public Pair(TreeNode n,int h){
            node = n;
            hd = h;
        }
    }
    public static TreeNode BFS(String[] arr){
        if(arr.length==0) return null;
        int n = arr.length;
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> pq = new LinkedList<>();
        pq.add(root);
        int i = 1;
        while(i<n-1){
            TreeNode temp = pq.remove();
            if(i<n-1 && !arr[i].equals("")){
                int l = Integer.parseInt(arr[i]);
                TreeNode lefty = new TreeNode(l);
                temp.left = lefty;
                pq.add(lefty);
            }
            i++;
            if(i<n-1 && !arr[i].equals("")){
                int r = Integer.parseInt(arr[i]);
                TreeNode righty = new TreeNode(r);
                temp.right = righty;
                pq.add(righty);
            }
            i++;
        }
        return root;
    }
    public static void LeftBoundary(TreeNode root){
        if(root==null || (root.left==null && root.right==null)) return;
        System.out.print(root.val+" ");
        if(root.left!=null) LeftBoundary(root.left);
        else LeftBoundary(root.right);
    }
    public static void Down(TreeNode root){
        if(root==null) return;
        if(root.left==null && root.right==null){
            System.out.print(root.val+" ");
            return;
        }
        Down(root.left);
        Down(root.right);
    }
    public static void TopView(TreeNode root){
        if(root==null) return;
        Queue<Pair> pq = new LinkedList<>();
        Map<Integer,Integer> topViewMap = new TreeMap<>();
        pq.add(new Pair(root,0));
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            TreeNode node = temp.node;
            int hd = temp.hd;
            if(!topViewMap.containsKey(hd)){
                topViewMap.put(hd,node.val);
            }
            if(node.left!=null)  pq.add(new Pair(node.left,hd-1));
            if(node.right!=null) pq.add(new Pair(node.right,hd+1));
        }
        for(Integer i : topViewMap.values()){
            System.out.print(i+" ");
        }
    }
    public static void DownView(TreeNode root){
        if(root==null) return;
        Queue<Pair> pq = new LinkedList<>();
        Map<Integer,Integer> DownViewMap = new TreeMap<>();
        pq.add(new Pair(root,0));
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            TreeNode node = temp.node;
            int hd = temp.hd;
            DownViewMap.put(hd,node.val);
            if(node.left!=null)  pq.add(new Pair(node.left,hd-1));
            if(node.right!=null) pq.add(new Pair(node.right,hd+1));
        }
        for(Integer j : DownViewMap.values()){
            System.out.print(j+" ");
        }
    }
    public static void RightBoundary(TreeNode root){
        if(root==null || (root.left==null && root.right==null)) return;
        if(root.right!=null) RightBoundary(root.right);
        else RightBoundary(root.left);
        System.out.print(root.val+" ");
    }
    public static void LeftView(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> pq = new LinkedList<>();
        pq.add(root);
        while(!pq.isEmpty()){
            int level = pq.size();
            for(int i = 1;i<=level;i++){
                TreeNode temp = pq.remove();
                if(i==1){
                    System.out.print(temp.val+" ");
                }
                if(temp.left!=null) pq.add(temp.left);
                if(temp.right!=null) pq.add(temp.right);
            }
        }
    }
    public static void RightView(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> pq = new LinkedList<>();
        pq.add(root);
        while(!pq.isEmpty()){
            int level = pq.size();
            for(int i = 1;i<=level;i++){
                TreeNode temp = pq.remove();
                if(i==1){
                    System.out.print(temp.val+" ");
                }
                if(temp.right!=null) pq.add(temp.right);
                if(temp.left!=null) pq.add(temp.left);
            }
        }
    }
    public static void main(String[] args) {
        String[] str = {"1","2","3","4","5","","6","7","","8","","9","10","","11","","12","","13","","14","15","16","","17","","","18","","19","","","","20","21","22","23","","24","25","26","27","","","28","",""};
        TreeNode root = BFS(str);
        System.out.print("Left View : ");
        LeftView(root);
        System.out.println(" ");
        System.out.print("Right View : ");
        RightView(root);
        System.out.println(" ");
        System.out.print("Top View : ");
        TopView(root);
        System.out.println(" ");
        System.out.print("Down View : ");
        DownView(root);
        System.out.println(" ");
        LeftBoundary(root);
        Down(root);
        RightBoundary(root.right);
    }
}
