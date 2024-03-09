from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs):
        # Create a dictionary to map sorted words to lists of anagrams
        anagram_map = defaultdict(list)
        
        # Iterate through each word in the input list
        for word in strs:
            # Sort the characters in the word and join them back into a string
            sorted_word = ''.join(sorted(word))
            # Append the original word to the list of anagrams corresponding to its sorted version
            anagram_map[sorted_word].append(word)
        
        # Return the values (lists of anagrams) of the dictionary as a list
        return list(anagram_map.values())

# Function to take input from the terminal and provide output
def main():
    # Take input from the user in the form of a list of strings
    strs = input("Enter a list of strings separated by spaces: ").split()
    
    # Create an instance of the Solution class
    solution = Solution()
    
    # Call the groupAnagrams function and store the result
    result = solution.groupAnagrams(strs)
    
    # Print the result
    print("Output:")
    print(result)

if __name__ == "__main__":
    main()
