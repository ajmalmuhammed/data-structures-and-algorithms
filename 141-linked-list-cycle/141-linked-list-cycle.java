/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = null;
        int count =0;
        
        while(fast!= null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                temp = fast;
                break;
            }
           
        }
        if(temp!=null){
            return true;
        }
        return false;
        
        
    }
}