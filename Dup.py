from typing import List  # Add this line to import the List type hint

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # Create an empty set to store unique elements
        unique_set = set()

        # Iterate through the array
        for num in nums:
            # Check if the current element is already in the set
            if num in unique_set:
                # If yes, it means we found a duplicate, so return True
                return True
            else:
                # If not, add the element to the set
                unique_set.add(num)

        # If the loop completes without returning True, it means there are no duplicates
        return False


# Function to take user input for an array
def get_input_array():
    input_str = input("Enter space-separated integers for the array: ")
    # Convert the input string into a list of integers
    input_array = list(map(int, input_str.split()))
    return input_array

# Main program
def main():
    # Get user input for the array
    user_array = get_input_array()

    # Create an instance of the Solution class
    solution_instance = Solution()

    # Call the containsDuplicate function with the user-provided array
    result = solution_instance.containsDuplicate(user_array)

    # Print the result
    print(f"Does the array contain duplicates? {'Yes' if result else 'No'}")

main()
