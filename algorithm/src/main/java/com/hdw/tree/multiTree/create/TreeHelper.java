package com.hdw.tree.multiTree.create;

import java.util.*;

/**
 * user:hudawei1
 * date:2018/6/5
 * time:11:07
 */
public class TreeHelper {


    public static TreeNode generateTree(List<TreeNode> list){
        if(list == null || list.size()==0){
            return null;
        }
        Map<String,TreeNode> map = new HashMap<>();
        for(TreeNode treeNode : list){
            map.put(treeNode.getId(),treeNode);
        }
        return generateTree(map);
    }



    public static TreeNode generateTree(Map<String,TreeNode> map){
        if(map == null){
            return null;
        }
        TreeNode rootNode = null;
        for(TreeNode treeNode : map.values()){
            if(treeNode.isRoot(treeNode)){
                rootNode = treeNode;
                continue;
            }
            String parentId = treeNode.getParentId();
            if(parentId != null && map.get(parentId) != null){
                map.get(parentId).addChildList(treeNode);
            }
        }

        //排序
        for(TreeNode treeNode : map.values()){
            if(treeNode != null && treeNode.getChildList() != null){
                Collections.sort(treeNode.getChildList(), new Comparator<TreeNode>() {
                    @Override
                    public int compare(TreeNode o1, TreeNode o2) {
                        return Integer.valueOf(o2.getId())-Integer.valueOf(o1.getId());
                    }
                });
            }

        }
        return rootNode;
    }
}
