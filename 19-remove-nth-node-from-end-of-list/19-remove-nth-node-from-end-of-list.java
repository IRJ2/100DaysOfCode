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
        ListNode temp, prev ,curr;
        int size = 0;
        int remove_at=0;
        if(head == null){
            return head;
        }
        
        temp = head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        
        remove_at = size - n;
        
        if(remove_at == 0){
            return head.next;
        }
        
        curr=head;
        for(int i=1;i<remove_at;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}