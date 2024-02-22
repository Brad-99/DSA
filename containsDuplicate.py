class Solution:
    def containsDuplicate(self, nums):
        hashset = set()

        for n in nums:
            if n in hashset:
                return True
            hashset.add(n)
        return False

def main():
    nums_input = input("Enter the array of integers separated by spaces: ")
    nums = list(map(int, nums_input.split()))

    solution = Solution()
    result = solution.containsDuplicate(nums)
    
    if result:
        print("True - There are duplicate elements in the array.")
    else:
        print("False - All elements in the array are distinct.")

if __name__ == "__main__":
    main()
