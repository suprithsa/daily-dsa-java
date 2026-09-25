/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {

        if (head == null) {
            return head;
        }

        flattenList(head);

        return head;
    }

    private Node flattenList(Node head) {

        Node current = head;
        Node last = head;

        while (current != null) {

            Node next = current.next;

            if (current.child != null) {

                Node child = current.child;

               
                Node childTail = flattenList(child);

                
                current.next = child;
                child.prev = current;

               
                if (next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }

                current.child = null;

                last = childTail;

            } else {
                last = current;
            }

            current = next;
        }

        return last;
    }
}