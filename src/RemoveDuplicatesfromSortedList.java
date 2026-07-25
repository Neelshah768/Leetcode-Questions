/*

83. Remove Duplicates from Sorted List
Given the head of a sorted linked list, delete all duplicates such that each
element appears only once. Return the linked list sorted as well.



Example 1:


Input: head = [1,1,2]
Output: [1,2]
Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]

 */

public class RemoveDuplicatesfromSortedList {

    public static class ListNode {
        int val;
        RemoveDuplicatesfromSortedList.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, RemoveDuplicatesfromSortedList.ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode deleteDuplicates(ListNode head){

        ListNode current=head;

        while(current != null && current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;

    }
    public static void main(String[] args) {

        // list1 = [1,1,2]
       ListNode list1 = new ListNode(1, new RemoveDuplicatesfromSortedList.ListNode(1, new RemoveDuplicatesfromSortedList.ListNode(2)));

       ListNode result = deleteDuplicates(list1);

       while (result != null){
           System.out.println(result.val);
           result = result.next;
       }


    }
}
