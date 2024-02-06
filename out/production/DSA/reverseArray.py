def reverse_array(arr, start, end):
    while start < end:
        # Swap elements at start and end indices
        arr[start], arr[end] = arr[end], arr[start]
        start += 1
        end -= 1

def print_array(arr):
    for num in arr:
        print(num, end=" ")
    print()

# Driver code
if __name__ == "__main__":
    # Prompt the user for the size of the array
    size = int(input("Enter the size of the array: "))

    # Prompt the user to enter the elements of the array
    arr = list(map(int, input(f"Enter {size} integers separated by spaces: ").split()))

    print("Original array is:", end=" ")
    print_array(arr)

    # Reverse the array
    reverse_array(arr, 0, size - 1)

    print("Reversed array is:", end=" ")
    print_array(arr)
