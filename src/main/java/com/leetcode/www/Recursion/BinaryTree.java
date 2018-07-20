package com.leetcode.www.Recursion;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;

public class BinaryTree {

    private TreeNode root;  //根节点

    public BinaryTree(){}

    public BinaryTree(TreeNode root){
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root){
        this.root = root;
    }

    /**
     * 节点类
     *
     */
    private static class TreeNode{
        private String data = null; //数据部分
        private TreeNode left;  //左节点的引用
        private TreeNode right; //右节点的引用
        //节点的构造函数
        public TreeNode(String data,TreeNode left,TreeNode right){
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }

    /**
     * 前序递归,根-左-右
     * @param node
     */
    public void preOrder_recur(TreeNode node){
        if(node!=null){
            System.out.print(node.getData()+"");
            preOrder_recur(node.getLeft());
            preOrder_recur(node.getRight());
        }
    }



    /**
     * 中序递归，左-右-根
     * @param node
     */
    public void inOrder_recur(TreeNode node){
        if (node!=null){
            inOrder_recur(node.getLeft());
            System.out.print(node.data+"");
            inOrder_recur(node.getRight());
        }
    }

    /**
     *后续遍历 左-右-根
     * @param node
     */
    public void postOrder_recur(TreeNode node){
        if (node!=null){
            postOrder_recur(node.getLeft());
            postOrder_recur(node.getRight());
            System.out.print(node.data+"");
        }
    }

    /**
     * 非递归前序遍历
     */
    public void preOrder(){
        TreeNode node = null;
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            node = stack.pop();
            System.out.print(node.data+"");
            if(node.getRight()!=null){
                stack.push(node.getRight());
            }
            if (node.getLeft()!=null){
                stack.push(node.getLeft());
            }
        }
        System.out.println();
    }

    public void inOrder(){
        TreeNode node=root;
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        while(node!=null||!stack.isEmpty()){
            while(node!=null){
                stack.push(node);
                node = node.getLeft();
            }
            if (!stack.isEmpty()){
                node = stack.pop();
                System.out.print(node.data+"");
                node = node.getRight();
            }
        }
        System.out.println();
    }

    public void postOrder(){
        TreeNode node_r = null;
        TreeNode node = root;
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        while(node !=null||!stack.isEmpty()){
            while(node!=null){
                stack.push(node);
                node = node.getLeft();
            }
            node = stack.pop();
            while(node !=null&&(node.getRight()==null||node.getRight()==node_r)){
                System.out.print(node.data+"");
                node_r = node;
                if (stack.isEmpty()){
                    System.out.println();
                    return;
                }
                node = stack.pop();
            }
            stack.push(node);
            node = node.getRight();
        }
    }


    public static void main(String args[]){

        TreeNode l2 = new TreeNode("E",null,null);
        TreeNode r1 = new TreeNode("D",null,null);
        TreeNode r2 = new TreeNode("C",l2,null);
        TreeNode l1 = new TreeNode("B",null,r2);
        TreeNode root = new TreeNode("A",l1,r1);

        BinaryTree binaryTree = new BinaryTree(root);
        binaryTree.preOrder_recur(binaryTree.getRoot());
        System.out.println();
        binaryTree.preOrder();
        binaryTree.inOrder_recur(binaryTree.getRoot());
        System.out.println();
        binaryTree.inOrder();
        binaryTree.postOrder_recur(binaryTree.getRoot());
        System.out.println();
        binaryTree.postOrder();

    }


}
