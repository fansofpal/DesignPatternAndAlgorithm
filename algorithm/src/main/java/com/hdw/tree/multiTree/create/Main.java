package com.hdw.tree.multiTree.create;

import com.hdw.tree.multiTree.BaseTreeNodeList;

/**
 * 树节点包含父节点id和子节点List。
 * 将List数组转为map.利用map创建树，时间复杂度O(n)
 * user:hudawei1
 * date:2018/6/5
 * time:13:18
 */
public class Main {

    public static void main(String[] args){
        TreeNode rootNode = TreeHelper.generateTree(BaseTreeNodeList.getTreeNodeList());
        System.out.println(rootNode);
    }
}
