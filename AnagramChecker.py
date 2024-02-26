# Anagram means exact the same characters but in different orders

def is_anagram(s, t):
    # Check if lengths are different, if yes, they can't be anagrams
    if len(s) != len(t):
        return False

    # Use a dictionary to count the frequency of each character
    char_count = {}

    # Count the frequency of characters in string s
    for c in s:
        char_count[c] = char_count.get(c, 0) + 1
        print(char_count)

    # Decrement the count for characters in string t
    for c in t:
        if c not in char_count:
            # If a character count becomes negative or not available, strings are not anagrams
            return False
        char_count[c] -= 1
        print('After Comparison: ', char_count)

    # If the code reaches here, both strings are anagrams
    return True

# Example usage
s1 = "anagram"
t1 = "nagaram"
print(is_anagram(s1, t1))  # Output: True

s2 = "rat"
t2 = "tar"
print(is_anagram(s2, t2))  # Output: False

s3 = "bbb"
t3 = "bba"
print(is_anagram(s3, t3))  # Output: False
