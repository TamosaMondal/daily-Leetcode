/*Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well
*/
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode ptr=dummy;
        while(ptr.next!=null && ptr.next.next!=null){
            if(ptr.next.val==ptr.next.next.val){
                int value=ptr.next.val;
                while(ptr.next!=null && ptr.next.val==value){
                    ptr.next=ptr.next.next;
                }
            }
            else{
                ptr=ptr.next;
            }
        }
        return dummy.next;
    }
}
