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
    public ListNode reverseEvenLengthGroups(ListNode head) {

        ListNode prevGroup = head;
        int groupSize = 2;

        while (prevGroup != null && prevGroup.next != null) {

          
            ListNode curr = prevGroup.next;
            int count = 0;

            while (curr != null && count < groupSize) {
                count++;
                curr = curr.next;
            }

           
            if (count % 2 == 0) {

                ListNode groupPrev = curr;
                ListNode node = prevGroup.next;

                for (int i = 0; i < count; i++) {
                    ListNode next = node.next;
                    node.next = groupPrev;
                    groupPrev = node;
                    node = next;
                }

               
                ListNode oldFirst = prevGroup.next;
                prevGroup.next = groupPrev;

               
                prevGroup = oldFirst;

            } else {

                
                for (int i = 0; i < count; i++) {
                    prevGroup = prevGroup.next;
                }
            }

            groupSize++;
        }

        return head;
    }
}