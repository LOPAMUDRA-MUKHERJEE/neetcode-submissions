class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths differ, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Array to store the frequency of 26 lowercase English letters
        int[] charCounts = new int[26];

        // Increment for characters in s, decrement for characters in t
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        // If they are anagrams, all counts should balance out to 0
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}