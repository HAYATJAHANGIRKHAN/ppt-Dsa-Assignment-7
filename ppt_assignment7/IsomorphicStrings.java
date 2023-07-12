//Question 1
//
// Given two strings s and t, *determine if they are isomorphic*.
//
//        Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//
//        All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
//
//        **Example 1:**
//
//        **Input:** s = "egg", t = "add"
//
//        **Output:** true


package ppt_assignment7;

import java.util.*;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Check if c1 already maps to a different character in t
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2)
                    return false;
            } else {
                // Check if c2 is already mapped by another character in s
                if (map.containsValue(c2))
                    return false;

                map.put(c1, c2);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean result = isIsomorphic(s, t);
        System.out.println(result);
    }
}
