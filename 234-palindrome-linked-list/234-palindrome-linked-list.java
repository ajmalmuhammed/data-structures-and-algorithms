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
    public boolean isPalindrome(ListNode head) {
        
        ListNode curr = head;
        ListNode last = middle(head);
        
        ListNode reversedList = reverse(last);
        
        while(curr != last){
            if(curr.val != reversedList.val){
                return false;
            }
            curr =curr.next;
            reversedList = reversedList.next;
        }
        
        return true;
    }
    
    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            
        }
        
        return slow;
    }
    
    public ListNode reverse(ListNode head){
        
        if(head.next == null){
            return head;
        }
        
        ListNode reversedList = reverse(head.next);
        // ListNode newHead = head.next;
        // newHead.next = head;
        head.next.next = head;
        head.next = null;
    return reversedList;
    }
    
}