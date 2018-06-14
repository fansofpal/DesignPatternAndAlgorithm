package com.hdw.tree.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * user:hudawei1
 * date:2018/6/13
 * time:10:03
 */
public class TreeHelper {


    /**
     * 1-9 的数组生成完全二叉树
     *       1
     *    2     3
     *  4   5  6  7
     *8   9
     * @return
     */
    public static TreeNode generateCompleteTree(){
        //新建层序遍历数组
        List<TreeNode> treeNodeList = new ArrayList<>();
        for(int i=1;i<10;i++){
            TreeNode treeNode = new TreeNode(String.valueOf(i),"name:"+String.valueOf(i));
            treeNodeList.add(treeNode);
        }

        //根据数组，生成二叉树
        for(int i=0;i<treeNodeList.size();i++){
            TreeNode treeNode = treeNodeList.get(i);
            int leftPos = 2*i+1;
            int rightPos = 2*i+2;
            if(leftPos<treeNodeList.size()){
                treeNode.setLeftTreeNode(treeNodeList.get(leftPos));
                if(rightPos<treeNodeList.size()){
                    treeNode.setRightTreeNode(treeNodeList.get(rightPos));
                }else{
                    break;
                }
            }else{
                break;
            }
        }

        return treeNodeList.get(0);

    }


    public static void main(String[] args){
        System.out.println("生成二叉树："+generateCompleteTree());
    }
}
