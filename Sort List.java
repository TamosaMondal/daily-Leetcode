/*Given the head of a linked list, return the list after sorting it in ascending order.
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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ListNode curr = head;
        while(curr != null){
            arr.add(curr.val);
            curr = curr.next;
        } 
        Collections.sort(arr);
        //Creating new linkedList
        ListNode head2 = new ListNode();
        ListNode temp=head2;
        for(int i=0;i<arr.size();i++){
            ListNode newNode = new ListNode(arr.get(i));
            head2.next = newNode;
            head2 = head2.next;
        }
        return temp.next;
    }
}
