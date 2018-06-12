package com.hdw.tree.multiTree;

import com.hdw.tree.multiTree.create.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * user:hudawei1
 * date:2018/6/6
 * time:18:38
 */
public class BaseTreeNodeList {

    public static List<TreeNode> getTreeNodeList(){
        TreeNode t1 = new TreeNode("1","1号",null);
        TreeNode t2 = new TreeNode("2","2号","1");
        TreeNode t3 = new TreeNode("3","3号","1");
        TreeNode t4 = new TreeNode("4","4号","1");
        TreeNode t5 = new TreeNode("5","5号","2");
        TreeNode t6 = new TreeNode("6","6号","2");
        TreeNode t7 = new TreeNode("7","7号","4");
        List<TreeNode> treeNodeList = new ArrayList<>();
        treeNodeList.add(t1);
        treeNodeList.add(t2);
        treeNodeList.add(t3);
        treeNodeList.add(t4);
        treeNodeList.add(t5);
        treeNodeList.add(t6);
        treeNodeList.add(t7);
        return treeNodeList;
    }
}
