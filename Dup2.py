from typing import List

class solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        unique_set = set()

        for num in nums:
            if num in unique_set:
                return True
            else:
                unique_set.add(num)
        # If loop complete without True then it'll return false
        return False
        

def getInput():
    input_string = input("Please enter int list split by space: ")
    input_array = list(map(int, input_string.split()))
    return input_array

def main():
    user_array = getInput()
    solution_instance = solution()
    result = solution_instance.containsDuplicate(user_array)

    print(f"Does array contains dup? {'Yes' if result else 'No'}")
main()