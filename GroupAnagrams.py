from collections import defaultdict

# Sort according Unicode and group them together

class Solution:
    def groupAnagrams(self, strs):
        # Create a dictionary to map sorted words to lists of anagrams
        anagram_map = defaultdict(list)

        for word in strs:
            sorted_word = ''.join(sorted(word))
            anagram_map[sorted_word].append(word)
        
        return list(anagram_map.values())
        
        # Iterate through each word in the input list
        # Sort the characters in the word and join them back into a string
        # Append the original word to the list of anagrams corresponding to its sorted version
        # Return the values (lists of anagrams) of the dictionary as a list

# Function to take input from the terminal and provide output
def main():
    # Take input from the user in the form of a list of strings
    strs = input("Enter a list of strings separated by spaces: ").split()
    
    # Create an instance of the Solution class
    solution = Solution()
    
    # Call the groupAnagrams function and store the result
    result = solution.groupAnagrams(strs)
    
    # Print the result!!
    print("Output:")
    print(result)

if __name__ == "__main__":
    main()
