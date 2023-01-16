/*Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null && headB==null){
            return null;
        }
        ListNode ptr=headA;
        ListNode ptr1=headB;
        while(ptr!=ptr1){
            if(ptr==null){
                ptr=headB;
            }else{
                ptr=ptr.next;
            }
             if(ptr1==null){
                ptr1=headA;
            }else{
                ptr1=ptr1.next;
            }
        }
        return ptr;
    }
}
