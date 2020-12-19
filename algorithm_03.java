package com.njtc;

public class algorithm_03 {
    public static void main(String[] args) {
        Solution_03 solution=new Solution_03();
       //solution.addTwoNumbers();
        ListNode listNode1_3=new ListNode(3);
        ListNode listNode1_2=new ListNode(4,listNode1_3);
        ListNode listNode1_1=new ListNode(2,listNode1_2);


        ListNode listNode2_5=new ListNode(9);
        ListNode listNode2_4=new ListNode(9,listNode2_5);
        ListNode listNode2_3=new ListNode(7,listNode2_4);
        ListNode listNode2_2=new ListNode(6,listNode2_3);
        ListNode listNode2_1=new ListNode(5,listNode2_2);

        ListNode resultNode = solution.addTwoNumbers(listNode1_1, listNode2_1);
        while(resultNode != null){
            System.out.println(resultNode.val);
            resultNode=resultNode.next;
        }

    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;

        this.next = next;
    }
}

class Solution_03 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode=new ListNode();
        ListNode pointNode=new ListNode();
        pointNode=resultNode;
        int sum=0;
        int jin=0;
        boolean isend = true;

        while(l1 !=null || l2 != null||!isend){
            isend=true;
            if(l1 != null && l2 != null){

                sum=l1.val+l2.val+jin;
                pointNode.val=sum%10;
                jin=0;


                l1=l1.next;
                l2=l2.next;
            }else if(l2 == null && l1 !=null){
                sum=l1.val+jin;
                pointNode.val=sum%10;
                jin=0;
                l1=l1.next;

            }else if(l1 == null && l2 != null){
                sum=l2.val+jin;
                pointNode.val=sum%10;
                jin=0;
                l2=l2.next;
            }else{
                pointNode.val=1;
                sum=0;
            }
            if(sum >= 10){
                jin=1;
                isend = false;
            }
            if(!(l1==null&&l2 == null) || !isend){
                ListNode next=new ListNode();
                pointNode.next=next;
                pointNode=pointNode.next;
            }



        }

        return resultNode;
    }
}


