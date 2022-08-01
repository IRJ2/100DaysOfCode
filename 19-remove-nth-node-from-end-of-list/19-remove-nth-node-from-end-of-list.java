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
        ListNode curr;
        int size = 0;
        int remove_at=0;
        curr = head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        
        remove_at = size - n;
        
        if(remove_at == 0){
            return head.next;
        }
        
        curr=head;

        while(remove_at>1){
            curr = curr.next;
            remove_at--;
        }
        curr.next = curr.next.next;
        return head;
    }
}