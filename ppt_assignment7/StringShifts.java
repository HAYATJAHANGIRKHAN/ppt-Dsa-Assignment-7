//<aside>
//💡 **Question 6**
//
//        Given two strings s and goal, return true *if and only if* s *can become* goal *after some number of **shifts** on* s.
//
//        A **shift** on s consists of moving the leftmost character of s to the rightmost position.
//
//        - For example, if s = "abcde", then it will be "bcdea" after one shift.
//
//        **Example 1:**
//
//        **Input:** s = "abcde", goal = "cdeab"
//
//        **Output:**
//
//        true
//
//</aside>

package ppt_assignment7;

public class StringShifts {
    public static boolean canTransform(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String concatenated = s + s;

        return concatenated.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean result = canTransform(s, goal);
        System.out.println(result);
    }
}
