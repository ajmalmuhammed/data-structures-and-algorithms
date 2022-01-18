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
        int count =0;
        
        while(fast!= null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                temp = fast;
                break;
            }
            else if (fast == null){
                return null;
            }
        }
        
        if(temp != null){
            ListNode newHead = head;
            while(temp != newHead){
                newHead = newHead.next;
                temp = temp.next;
                if(temp == newHead){
                    break;
                }
            }
                   
            return temp;
        }
        else{
            return null;
        }
    }
}