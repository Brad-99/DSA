# Represents a node of a linked list
class Node:
    def __init__(self, val):
        self.data = val  # Data element of the node (stores an integer)
        self.next = None  # Reference to the next node in the list

# Global variable for counting the frequency of a given element
frequency = 0

# Method to add a new node at the front of the list
def push(head, new_data):
    # Create a new node with the given data
    new_node = Node(new_data)

    # Link the new node to the current head of the list
    new_node.next = head

    # Update the head to be the new node
    head = new_node

    # Return the updated list head
    return head

# Method to count the occurrences of a specific value in the list
def count(head, key):
    global frequency  # Use the global variable for frequency

    # Base case: if list is empty, return the frequency
    if head is None:
        return frequency

    # If the current node's data matches the key, increment frequency
    if head.data == key:
        frequency += 1

    # Recursively count in the rest of the list
    return count(head.next, key)

# Main method to run the code
if __name__ == "__main__":
    # Initialize an empty list
    head = None

    # Construct the list 1->2->1->3->1
    head = push(head, 1)
    head = push(head, 3)
    head = push(head, 1)
    head = push(head, 2)
    head = push(head, 1)

    # Count the occurrences of 1 in the list and print the result
    print("count of 1 is", count(head, 1))
