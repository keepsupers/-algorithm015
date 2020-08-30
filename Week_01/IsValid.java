package week1.day1;

import java.util.LinkedList;

/**
 * @author : haozhang
 * @date : Created in  2020-08-29
 * @description :是否是有效括号
 * @modified By：
 * @version: 1.0
 */
public class IsValid {
    public static void main(String[] args) {
        String str = "[[]]";
        boolean result = isValidate(str);
        System.out.println(result);
    }

    private static boolean isValidate(String str) {
        LinkedList<Character> stack = new LinkedList<Character>();
        for (char element : str.toCharArray()) {
            switch (element) {
                case '[':
                    stack.addFirst(']');
                    break;
                case '(':
                    stack.addFirst(')');
                    break;
                case '{':
                    stack.addFirst('}');
                    break;
                default:
                    if (stack.isEmpty() || element != stack.removeFirst()) {
                        return false;
                    }
            }
        }

        return stack.isEmpty();
    }
}
