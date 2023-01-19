/*Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=dummy;
        ListNode pre=dummy;
        ListNode temp=dummy;
        int count=0;
        while(cur.next!=null){
            cur=cur.next;
            count++;
        }
        System.out.println(count);
        while(count>=k){
            cur=pre.next;
            temp=cur.next;
            for(int i=0;i<k-1;i++){
                cur.next=temp.next;
                temp.next=pre.next;
                pre.next=temp;
                temp=cur.next;

            }
            pre=cur;
            count=count-k;
        }
        return dummy.next;
    }
}
