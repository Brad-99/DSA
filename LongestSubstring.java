import java.util.HashMap;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (map.containsKey(currentChar)) {
                start = Math.max(map.get(currentChar) + 1, start);
            }
            map.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("Length of longest substring without repeating characters in \"" + s1 + "\": "
                + lengthOfLongestSubstring(s1));
        System.out.println("Length of longest substring without repeating characters in \"" + s2 + "\": "
                + lengthOfLongestSubstring(s2));
        System.out.println("Length of longest substring without repeating characters in \"" + s3 + "\": "
                + lengthOfLongestSubstring(s3));
    }
}
