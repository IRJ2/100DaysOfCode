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
public ListNode reverseList(ListNode head) {
ListNode r_head=null ;
for(ListNode temp = head; temp!=null; temp=temp.next){
ListNode newNode = new ListNode(temp.val);
if(r_head == null){
r_head = newNode;
}
else{
newNode.next = r_head;
r_head = newNode;
}
}
return r_head;
}
}