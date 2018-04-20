package com.hdw.linkedList;

/**
 * 反转单链表
 * user:hudawei1
 * date:2018/4/20
 * time:17:55
 */
public class LinkedListRevert {

    public static void main(String[] args){
        Node node1 = new Node("1",1);
        Node node2 = new Node("2",2);
        Node node3 = new Node("3",3);
        Node node4 = new Node("4",4);
        node1.nextNode = node2;
        node2.nextNode = node3;
        node3.nextNode = node4;
        Node resultNode = revertLinkedList(node1);
        while (resultNode!=null){
            System.out.println(resultNode.name);
            resultNode = resultNode.nextNode;
        }

    }
    public static Node revertLinkedList(Node head){
        if(head == null){
            return head;
        }

        Node pre = head;
        Node cur = head.nextNode;
        Node temp = null;

        while(cur !=null){
            temp = cur.nextNode;
            cur.nextNode = pre;

            pre = cur;
            cur = temp;
        }
        head.nextNode = null;

        return pre;


    }
}
