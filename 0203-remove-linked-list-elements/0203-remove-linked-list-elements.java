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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        while(temp != null){
            if(head.val == val){
                ListNode p = head;
                head = head.next;
                p.next = null;
                temp = head; 
                continue;
            }
            if(temp.next==null){
                return head;
            }
            if(temp.next.val == val){
                ListNode p = temp.next;
                temp.next = temp.next.next;
                p.next = null;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }
}