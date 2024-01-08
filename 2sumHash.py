def two_sum(nums, target):
    num_indices = {}  # Dictionary to store number and its index
    pairs = []  # List to store pairs of indices

    # First loop: store each number and its index in the dictionary
    for i, num in enumerate(nums):
        num_indices[num] = i

    # Second loop: find pairs that add up to the target
    for i, num in enumerate(nums):
        complement = target - num  # Calculate the complement of the current number

        # Check if the complement exists in the dictionary and is not the current number itself
        if complement in num_indices and num_indices[complement] != i:
            pairs.append([i, num_indices[complement]])  # Add the pair of indices to the list
            del num_indices[num]  # Remove the current number to avoid duplicate pairs

    return pairs  # Return the list of pairs

# Main method - entry point of the program
if __name__ == "__main__":
    # Prompt user to enter the number of elements in the array
    n = int(input("Enter the number of elements in the array: "))
    
    # Prompt user to enter the elements of the array
    nums = [int(x) for x in input("Enter the elements of the array: ").split()]

    # Prompt user to enter the target sum
    target = int(input("Enter the target sum: "))

    # Call the two_sum function and store the result in 'results'
    results = two_sum(nums, target)

    # Check if the result list is not empty and display the pairs
    if results:
        print("All pairs of indices:")
        for pair in results:
            print(pair[0], pair[1])  # Print each pair of indices
    else:
        # If no pairs found, display a message
        print("No pairs add up to the target.")
