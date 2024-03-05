# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # Special case: if head is None or head's next is None, return head
        if not head or not head.next:
            return head
        
        # Recursively call reverseList function on the next node
        res = self.reverseList(head.next)
        
        # Set head node as head.next.next
        head.next.next = head
        
        # Set head's next to be None
        head.next = None
        
        return res

# Function to create a linked list from a list of values
def create_linked_list(values):
    if not values:
        return None
    head = ListNode(values[0])
    current = head
    for val in values[1:]:
        current.next = ListNode(val)
        current = current.next
    return head

# Function to print the linked list
def print_linked_list(head):
    current = head
    while current:
        print(current.val, end=" ")
        current = current.next
    print()

# Take input from the user
values = list(map(int, input("Enter space-separated values for the linked list: ").split()))

# Create a linked list from the input values
head = create_linked_list(values)

# Create an instance of the Solution class
sol = Solution()

# Reverse the linked list
reversed_head = sol.reverseList(head)

# Print the reversed linked list
print("Reversed Linked List:")
print_linked_list(reversed_head)
