# Importing List from the typing module to specify the type of 'nums' parameter
from typing import List

# Define a class named Solution
class Solution:
    # Define a method named twoSum which takes a list of integers (nums) and an integer (target) as parameters
    # It returns a list of integers representing the indices of the two numbers whose sum is equal to the target
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # Initialize a dictionary to store previously seen numbers and their indices
        prevMap = {}  # val -> index

        # Loop through the list of numbers along with their indices
        for i, n in enumerate(nums):
            # Calculate the difference needed to reach the target
            diff = target - n
            # If the difference is present in the dictionary, it means we've found the pair
            if diff in prevMap:
                # Return the indices of the current number and the number needed to reach the target
                return [prevMap[diff], i]
            # Otherwise, add the current number and its index to the dictionary
            prevMap[n] = i

# Define a function named main, which serves as the entry point of the program
def main():
    # Ask the user to input a list of integers separated by space and convert it into a list of integers
    nums = list(map(int, input("Enter the array of integers separated by space: ").split()))
    # Ask the user to input the target sum
    target = int(input("Enter the target sum: "))

    # Create an instance of the Solution class
    solution = Solution()
    # Call the twoSum method with the input list of integers and the target sum
    result = solution.twoSum(nums, target)
    # Print the indices of the two numbers whose sum is equal to the target
    print("Indices of the two numbers:", result)

# If the script is executed directly (not imported as a module), call the main function
if __name__ == "__main__":
    main()
