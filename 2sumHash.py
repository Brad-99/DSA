from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        prevMap = {}  # val -> index

        for i, n in enumerate(nums):
            diff = target - n
            if diff in prevMap:
                return [prevMap[diff], i]
            prevMap[n] = i

def main():
    nums = list(map(int, input("Enter the array of integers separated by space: ").split()))
    target = int(input("Enter the target sum: "))

    solution = Solution()
    result = solution.twoSum(nums, target)
    print("Indices of the two numbers:", result)

if __name__ == "__main__":
    main()
