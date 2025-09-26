/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
     int i=0;
     if(head==null){
        return head;
     }   
     ListNode ptr=head;
     while(i<k && ptr!=null){
        i++;
        ptr=ptr.next;
     }
     if(i<k){
        return head;
     }
     int num=0;
     ListNode curr=head,prev=null;
     while(num<k){
        num++;
        ListNode temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
     }
     head.next = reverseKGroup(curr, k);
     return prev;
    }
}