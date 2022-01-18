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
    public ListNode detectCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = null;
        Boolean isCyclePresent = false;
        int count =0;
        
        while(fast!= null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                isCyclePresent = true;
                break;
            }
            else if (fast == null){
                return null;
            }
        }
        
        if(isCyclePresent){
            ListNode newHead = head;
            while(slow != newHead){
                newHead = newHead.next;
                slow = slow.next;
                if(slow == newHead){
                    break;
                }
            }
                   
            return slow;
        }
        else{
            return null;
        }
    }
}