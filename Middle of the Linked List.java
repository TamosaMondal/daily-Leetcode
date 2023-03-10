/*Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.*/



class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
    count = count/2 + 1;
    ListNode cur = head;
    for(int i = 1; i < count; ++i){
        cur = cur.next;
    }
    return cur;
    }
}
