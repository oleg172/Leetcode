package easy.string.problem20;

import java.util.*;

public class Parentheses
{
    /*
    * Дана строка содержащая в себе символы: '(', ')', '{', '}', '[' и ']'
    * Строка верна, если скобка закрыта тем же видом скобки, открытые скобки должны быть закрыты в верном порядке.
    *
    * Пример 1:
    * Input: "()"
    * Output: true
    *
    * Пример 2:
    * Input: "()[]{}"
    * Output: true
    *
    * Пример 3:
    * Input: "(]"
    * Output: false
    *
    * Пример 4:
    * Input: "([)]"
    * Output: false
    *
    * Пример 5:
    * Input: "{[]}"
    * Output: true
    * */

    public boolean isValid(String s)
    {
        if (s.length() == 0)
        {
            return true;
        }
        Map<Character, Character> parenthnes = new HashMap<>();
        parenthnes.put(')', '(');
        parenthnes.put('}', '{');
        parenthnes.put(']', '[');

        Set<Character> openParenthneses = new HashSet<>();
        openParenthneses.add('(');
        openParenthneses.add('{');
        openParenthneses.add('[');

        Set<Character> closeParenthneses = new HashSet<>();
        closeParenthneses.add(')');
        closeParenthneses.add('}');
        closeParenthneses.add(']');

        int countOpen = 0;

        String ss = "";

        for (int i = 0; i < s.length(); i++)
        {
            if (openParenthneses.contains(s.charAt(i)))
            {
                ss = ss + s.charAt(i);
                countOpen++;
            }
            if (closeParenthneses.contains(s.charAt(i)))
            {
                if (ss.length() == 0)
                {
                    return false;
                }
                if (parenthnes.get(s.charAt(i)).equals(ss.charAt(countOpen - 1)))
                {
                    ss = ss.substring(0, ss.length() - 1);
                    countOpen--;
                } else return false;
            }
        }
        return ss.length() == 0 ? true : false;
    }

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ('(' == c || '{' == c || '[' == c) {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (c == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (c == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args)
    {
        Parentheses parentheses = new Parentheses();
        parentheses.isValid2("[{]");
        int k = 1;
    }
}
