package com.hdw.tree.binaryTree;

/**
 * user:hudawei1
 * date:2018/6/12
 * time:18:31
 */
public class TreeNode {

    private TreeNode parentId;
    private String id;
    private String name;

    private TreeNode leftTreeNode;
    private TreeNode rightTreeNode;


    public TreeNode(){

    }

    public TreeNode(String id,String name){
        this.id = id;
        this.name = name;
    }


    public TreeNode getParentId() {
        return parentId;
    }

    public void setParentId(TreeNode parentId) {
        this.parentId = parentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(TreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public TreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(TreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "parentId=" + parentId +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", leftTreeNode=" + leftTreeNode +
                ", rightTreeNode=" + rightTreeNode +
                '}';
    }
}
