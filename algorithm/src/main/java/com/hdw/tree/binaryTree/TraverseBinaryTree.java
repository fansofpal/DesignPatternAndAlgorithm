package com.hdw.tree.binaryTree;

import java.util.Stack;

/**
 * 根节点被访问的时机：
 * 1、前序遍历：压栈时访问。
 * 2、中序遍历：出栈时访问。
 * 3、后续遍历：必须在访问完右子树后访问。
 *
 * user:hudawei1
 * date:2018/6/14
 * time:18:34
 */
public class TraverseBinaryTree {


    public static TreeNode headTreeNode;

    static{
        headTreeNode = TreeHelper.generateCompleteTree();
    }


    public static void main(String[] args){
//        preOrder(headTreeNode);
//        preOrder2(headTreeNode);
//        midOrder(headTreeNode);
//        midOrder2(headTreeNode);
        postOrder(headTreeNode);
    }



    /**
     * 前序遍历：递归
     * @param treeNode
     */
    public static void preOrder(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        System.out.println("treeNode:"+treeNode.getName());
        preOrder(treeNode.getLeftTreeNode());
        preOrder(treeNode.getRightTreeNode());
    }

    /**
     * 前序遍历：非递归
     * 访问顺序：1、首节点及其左子节点压栈，压栈时按顺序记录。
     * 2、节点出栈，出栈时记录其右子节点。
     * 3、右子节点作为首节点，继续压栈。
     * @param treeNode
     */
    public static void preOrder2(TreeNode treeNode){
        Stack<TreeNode> stack = new Stack<>();
        while(true){
            //左侧节点全部压栈
            while(treeNode!=null){
                System.out.println("treeNode:"+treeNode.getName());
                stack.push(treeNode);
                treeNode = treeNode.getLeftTreeNode();
            }
            //出栈，出栈后，将右节点作为首节点，重复左侧节点全部压栈。
            if(stack.isEmpty()){
                break;
            }
            treeNode = stack.pop().getRightTreeNode();
        }
    }

    /**
     * 中序遍历：递归
     */
    public static void midOrder(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        midOrder(treeNode.getLeftTreeNode());
        System.out.println("treeNode:"+treeNode.getName());
        midOrder(treeNode.getRightTreeNode());
    }

    /**
     * 中序遍历：非递归
     */
    public static void midOrder2(TreeNode treeNode){
        Stack<TreeNode> stack = new Stack();

        while(true){
            while(treeNode != null){
                stack.push(treeNode);
                treeNode = treeNode.getLeftTreeNode();
            }
            if(stack.isEmpty()){
                break;
            }
            treeNode = stack.pop();
            System.out.println("treeNode:"+treeNode.getName());
            treeNode = treeNode.getRightTreeNode();

        }
    }

    /**
     * 后序遍历：递归
     */
    public static void postOrder(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        postOrder(treeNode.getLeftTreeNode());
        postOrder(treeNode.getRightTreeNode());
        System.out.println("treeNode:"+treeNode.getName());
    }


    /**
     * 后序遍历：非递归
     */
    public static void postOrder2(TreeNode treeNode){




    }






}
