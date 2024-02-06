# Class representing a node in the stack
class StackNode:
    def __init__(self, data):
        self.data = data
        self.next = None

# Class representing the stack using a linked list
class MyStack:
    def __init__(self):
        self.top = None

    # Method to push a new element onto the stack
    def push(self, data):
        new_node = StackNode(data)  # Create a new node with given data
        new_node.next = self.top  # Link the new node with the current top
        self.top = new_node  # Update the top to be the new node

    # Method to pop the top element from the stack
    def pop(self):
        if self.top is None:  # Check if the stack is empty
            return -1  # Return -1 to indicate the stack is empty
        else:
            popped_data = self.top.data  # Store the data of the top node
            self.top = self.top.next  # Update the top to the next node
            return popped_data  # Return the popped data

# Main method to run the program
if __name__ == "__main__":
    stack = MyStack()  # Create a new stack

    operations = int(input("Enter number of operations: "))  # Read number of operations

    for _ in range(operations):
        operation = int(input("Enter operation (1 for push, 2 for pop): "))  # Read the operation type

        if operation == 1:
            number = int(input("Enter a number to push: "))  # Read the number to push
            stack.push(number)  # Push the number onto the stack
        elif operation == 2:
            result = stack.pop()  # Pop the top element from the stack
            if result == -1:
                print("Stack is empty.")
            else:
                print("Popped element:", result)
        else:
            print("Invalid operation.")
