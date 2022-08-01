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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp,curr;
        int size = 0;
        if(head == null){
            return head;
        }
        
        temp = head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        
        
        if(size - n == 0){
            return head.next;
        }
        
        curr=head;
        for(int i=1;i<size - n;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}