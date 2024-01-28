import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class reverseLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Creating a linked list
        System.out.println("Enter the number of nodes in the linked list:");
        int n = scanner.nextInt();

        System.out.println("Enter the values of the linked list nodes:");
        ListNode head = null;
        ListNode tail = null;



        // Reversing the linked list
        ListNode reversedList = reverseList(head);

        // Output: Displaying the reversed linked list
        System.out.println("Reversed Linked List:");
        while (reversedList != null) {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }

        scanner.close();
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
