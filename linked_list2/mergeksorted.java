import java.util.ArrayList;
import java.util.Collections;

import practice.basic.ll2.ListNode;

public class mergeksorted {
    //merge k sorted ll
    //run on lc only
    //https://leetcode.com/problems/merge-k-sorted-lists/
    
    //without using another data structure
    public ListNode merge(ListNode headA,ListNode headB){
        ListNode merged=new ListNode(-1);
        ListNode temp=merged;
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null && tempB!=null){
            if(tempA.val>=tempB.val){
                temp.next=tempB;
                temp=tempB;
                tempB=tempB.next;
            }else{
                temp.next=tempA;
                temp=tempA;
                tempA=tempA.next;
            }
        }
        if(tempA!=null){
            temp.next=tempA;
            
        }else{
            temp.next=tempB;
        }
        return merged.next;
    }
    public ListNode mergeKLists(ListNode[] l) {
        if(l.length==0){
            return null;
        }
        ListNode head=l[0];
        for(int i=1;i<l.length;i++){
            head=merge(head,l[i]);
        }
        return head;
    }

    //using another data struct.
    public ListNode mergeKLists(ListNode[] l) {
        if(l.length==0){
            return null;
        }
        ListNode merge=new ListNode(-1);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            ListNode temp=l[i];
            while(temp!=null){
                ans.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(ans);
        ListNode temp=merge;
        for(int i=0;i<ans.size();i++){
            ListNode newNode =new ListNode(ans.get(i));
            temp.next=newNode;
            temp=newNode;
        }
        return merge.next;
    }

}
