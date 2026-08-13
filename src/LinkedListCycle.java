/*

141. Linked List Cycle

Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

 xample 1:


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:


Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:


Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.


Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.

 */


public class LinkedListCycle {
    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast !=null || fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                return true;
            }

        }
        return false;
    }

    public static void main() {
        int[] values = {3, 2, 0, -4};
        int pos = 1; // index the tail connects back to (-1 means no cycle)

        // Step 1: build the list normally, keeping track of each node
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        ListNode[] nodes = new ListNode[values.length];
        nodes[0] = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
            nodes[i] = current;
        }

        // Step 2: wire up the cycle if pos != -1
        if (pos != -1) {
            current.next = nodes[pos]; // tail connects to node at index pos
        }

        System.out.println(hasCycle(head));


    }
}
