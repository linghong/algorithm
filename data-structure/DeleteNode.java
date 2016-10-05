/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        ListNode nodeNext =node.next;
        //change the value to the next node value
        node.val=node.next.val;
        //point it to next.next
        node.next=node.next.next;
        //remove the next node
        nodeNext.next =null;
    }
}