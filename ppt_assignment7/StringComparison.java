//<aside>
//💡 **Question 7**
//
//        Given two strings s and t, return true *if they are equal when both are typed into empty text editors*. '#' means a backspace character.
//
//        Note that after backspacing an empty text, the text will continue empty.
//
//        **Example 1:**
//
//        **Input:** s = "ab#c", t = "ad#c"
//
//        **Output:** true
//
//        **Explanation:**
//
//        Both s and t become "ac".
//
//</aside>

package ppt_assignment7;
import java.util.*;
public class StringComparison {



        public static boolean backspaceCompare(String s, String t) {
            StringBuilder sbS = new StringBuilder();
            StringBuilder sbT = new StringBuilder();

            for (char c : s.toCharArray()) {
                if (c != '#') {
                    sbS.append(c);
                } else if (sbS.length() > 0) {
                    sbS.deleteCharAt(sbS.length() - 1);
                }
            }

            for (char c : t.toCharArray()) {
                if (c != '#') {
                    sbT.append(c);
                } else if (sbT.length() > 0) {
                    sbT.deleteCharAt(sbT.length() - 1);
                }
            }

            return sbS.toString().equals(sbT.toString());
        }

        public static void main(String[] args) {
            String s = "ab#c";
            String t = "ad#c";
            boolean result = backspaceCompare(s, t);
            System.out.println(result);  // Output: true
        }
    }


