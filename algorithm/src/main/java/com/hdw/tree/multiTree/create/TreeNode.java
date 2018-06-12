package com.hdw.tree.multiTree.create;

import java.util.ArrayList;
import java.util.List;

/**
 * user:hudawei1
 * date:2018/6/5
 * time:10:57
 */
public class TreeNode {
    private String id;
    private String name;
    private String parentId;
    private List<TreeNode> childList;


    public TreeNode(){

    }

    public TreeNode(String id,String name,String parentId){
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }



    public boolean isRoot(TreeNode treeNode){
        if(treeNode != null && treeNode.parentId == null){
            return true;
        }
        return false;
    }

    public void addChildList(TreeNode treeNode){
        if(childList == null){
            childList = new ArrayList<>();
        }
        childList.add(treeNode);
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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<TreeNode> getChildList() {
        return childList;
    }

    public void setChildList(List<TreeNode> childList) {
        this.childList = childList;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", parentId='" + parentId + '\'' +
                ", childList=" + childList +
                '}';
    }
}
